$( "button.btn-secondary" ).on( "click", function( event ) {
    document.location = '../index.html';
});

//cadastrar servico
function servico() {
    var tipo = $("#tipo").val();
    var data = $("#data").val();
    var valorServico = $("#valorServico").val();
    var descricao = $("#descricao").val();
    var horarioInicial = $("#horarioInicial").val();
    var horarioFim = $("#horarioFim").val();
    var status = $("#status").val();
    var idVeiculo = $("#idVeiculo").val();
    var idColaborador = $("#idColaborador").val();
    var idCliente = $("#idCliente").val();
    
    axios.post('http://localhost:8080/servico',
    {
        "tipo" : tipo,
        "data" : data,
        "valorServico" : valorServico,
        "descricao" : descricao,
        "horarioInicial" : horarioInicial,
        "horarioFim" : horarioFim,
        "status" : status,
        "idVeiculo" : idVeiculo,
        "idColaborador" : idColaborador,
        "idCliente" : idCliente,

    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "servico.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

servico(); 

//cadastro de servico inicializado
function servicoInicializado() {
    var idSvInicializado = $("#idSvInicializado").val();
    var idServico = $("#idServico").val();
    var idPagamento = $("#idPagamento").val();
    
    axios.post('http://localhost:8080/tuctuc/servico/servicoInicializado',
    {
        "idSvInicializado" : idSvInicializado,
        "idServico" : idServico,
        "idPagamento" : idPagamento,
       
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "servico.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

servicoInicializado(); 

//cadastro de tipo de servico
function tipoServico() {
    var nomeServico = $("#nomeServico").val();
    var valor = $("#valor").val();
    
    axios.post('http://localhost:8080/servico/tipoServico',
    {
        "nomeServico" : nomeServico,
        "valor" : valor,
       
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "servico.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

tipoServico(); 