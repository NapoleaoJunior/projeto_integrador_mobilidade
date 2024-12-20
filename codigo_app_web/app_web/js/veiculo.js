$( "button.btn-secondary" ).on( "click", function( event ) {
    document.location = '../index.html';
});

//cadastro de servico inicializado
function veiculo() {
    var tipo = $("#tipo").val();
    var patrimonio = $("#patrimonio").val();
    var descricao = $("#descricao").val();
    var docVeiculo = $("#docVeiculo").val();
    var idColaborador = $("#idColaborador").val();    
    axios.post('http://localhost:8080/tuctuc/veiculo',
    {
        "tipo" : tipo,
        "patrimonio" : patrimonio,
        "descricao" : descricao,
        "docVeiculo" : docVeiculo,
        "idColaborador" : idColaborador,
       
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "veiculo.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

veiculo(); 