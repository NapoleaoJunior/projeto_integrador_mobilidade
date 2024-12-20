// Exemplo básico para interatividade
document.getElementById("rideRequestForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const pickup = document.getElementById("pickup").value;
    const destination = document.getElementById("destination").value;

    if (!pickup || !destination) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    alert(`Rota solicitada de ${pickup} para ${destination}.`);
});