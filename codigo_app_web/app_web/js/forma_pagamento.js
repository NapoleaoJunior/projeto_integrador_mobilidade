$( "button.btn-secondary" ).on( "click", function( event ) {
    document.location = '../index.html';
});

function formaPagamento() {
    var desconto = $("#desconto").val();
    var metodo = $("#metodo").val;
    var idServico = $("#idServico").val();
    
    axios.post('http://localhost:8080/tuctuc/formaPagamento',
    {
        "desconto" : desconto,
        "metodo" : metodo,
        "idServico" : idServico,
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "listaCliente.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

formaPagamento(); 