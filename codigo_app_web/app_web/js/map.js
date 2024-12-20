document.addEventListener('DOMContentLoaded', function () {
    var map = L.map('map-placeholder').setView([-15.78884435343412, -47.897822381834956], 13);

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(map);

    var clickCount = 0;
    var markers = [];
    var routingControl;
    var selectedPickupLatLng = null;
    var selectedDestinationLatLng = null;

    // Função para obter o endereço usando a geocodificação reversa
    function getAddress(lat, lng, callback) {
      var url = `https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=${lat}&lon=${lng}`;
      fetch(url)
        .then(response => response.json())
        .then(data => {
          callback(data.display_name);
        })
        .catch(error => {
          console.error('Error fetching address:', error);
          callback(null);
        });
    }

    // Função para armazenar os dados no banco de dados via API
    function storeDataInDatabase(pickupLatLng, destinationLatLng) {
      fetch('/api/store-corrida', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({
          pickup_lat: pickupLatLng.lat,
          pickup_lng: pickupLatLng.lng,
          destination_lat: destinationLatLng.lat,
          destination_lng: destinationLatLng.lng
        })
      })
      .then(response => response.json())
      .then(data => {
        console.log('Corrida armazenada no banco de dados:', data);
      })
      .catch(error => {
        console.error('Erro ao armazenar corrida:', error);
      });
    }

    // Evento de clique no mapa
    map.on('click', function (e) {
      clickCount++;
      var lat = e.latlng.lat;
      var lng = e.latlng.lng;

      getAddress(lat, lng, function (address) {
        if (clickCount === 1) {
          // Primeira seleção (Local de Partida)
          document.getElementById('pickup').value = address || `${lat}, ${lng}`;

          // Remove o marcador anterior (se houver)
          if (markers[0]) {
            map.removeLayer(markers[0]);
          }

          // Marca o Local de Partida
          var marker = L.marker(e.latlng).addTo(map)
            .bindPopup('Clique para selecionar o destino final.')
            .openPopup();
          markers[0] = marker;  // Armazena o marcador de Partida
          selectedPickupLatLng = e.latlng;  // Armazena a localização do ponto de partida

        } else if (clickCount === 2) {
          // Segunda seleção (Local de Destino)
          document.getElementById('destination').value = address || `${lat}, ${lng}`;

          // Remove o marcador anterior (se houver)
          if (markers[1]) {
            map.removeLayer(markers[1]);
          }

          // Marca o Local de Destino
          var marker = L.marker(e.latlng).addTo(map)
            .bindPopup('Destino selecionado.')
            .openPopup();
          markers[1] = marker;  // Armazena o marcador de Destino
          selectedDestinationLatLng = e.latlng;  // Armazena a localização do ponto de destino

          // Traçar a rota entre ponto de partida e destino
          if (routingControl) {
            map.removeControl(routingControl);
          }
          routingControl = L.Routing.control({
            waypoints: [
              L.latLng(markers[0].getLatLng()),
              L.latLng(e.latlng)
            ],
            routeWhileDragging: true
          }).addTo(map);

          // Armazena a corrida no banco de dados
          storeDataInDatabase(selectedPickupLatLng, selectedDestinationLatLng);

          clickCount = 0; // Reset click count for next selection
        } else if (clickCount === 3) {
          // Terceira seleção - Resetar para Local de Partida e limpar a seleção anterior
          document.getElementById('pickup').value = address || `${lat}, ${lng}`;
          document.getElementById('destination').value = '';  // Limpa o campo de destino

          // Remove todos os marcadores do mapa
          markers.forEach(function(marker) {
            map.removeLayer(marker);
          });

          // Limpa o array de marcadores
          markers = [];

          // Marca novamente o Local de Partida
          var marker = L.marker(e.latlng).addTo(map)
            .bindPopup('Clique para selecionar o destino final.')
            .openPopup();
          markers[0] = marker;  // Armazena o marcador de Partida
          selectedPickupLatLng = e.latlng;  // Armazena a nova localização de partida

          // Reiniciar o contador de cliques para permitir novo ciclo
          clickCount = 1;
        } else if (clickCount === 4) {
          // Quarta seleção - Resetar para Local de Destino e fazer nova rota
          document.getElementById('destination').value = address || `${lat}, ${lng}`;

          // Remove o marcador anterior de Destino (se houver)
          if (markers[1]) {
            map.removeLayer(markers[1]);
          }

          // Marca o novo Local de Destino
          var marker = L.marker(e.latlng).addTo(map)
            .bindPopup('Destino selecionado.')
            .openPopup();
          markers[1] = marker;  // Armazena o novo marcador de Destino

          // Traçar a nova rota entre ponto de partida e destino
          if (routingControl) {
            map.removeControl(routingControl);
          }
          routingControl = L.Routing.control({
            waypoints: [
              L.latLng(markers[0].getLatLng()),
              L.latLng(e.latlng)
            ],
            routeWhileDragging: true
          }).addTo(map);

          // Armazenar novamente a corrida no banco de dados
          storeDataInDatabase(selectedPickupLatLng, selectedDestinationLatLng);

          // Reiniciar o contador de cliques para permitir um novo ciclo
          clickCount = 0;
        }
      });
    });

    // Função para limpar os campos de seleção e os marcadores
    document.getElementById("limparCampos").addEventListener("click", function () {
      // Limpar os campos de texto
      document.getElementById('pickup').value = '';
      document.getElementById('destination').value = '';

      // Remover os marcadores do mapa
      markers.forEach(function (marker) {
        map.removeLayer(marker);  // Remove cada marcador
      });
      
      // Limpar o array de marcadores
      markers = [];

      // Remover a rota, se houver
      if (routingControl) {
        map.removeControl(routingControl);
      }

      // Resetar o contador de cliques
      clickCount = 0;
    });
  });