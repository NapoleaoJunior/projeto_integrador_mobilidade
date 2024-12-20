$( "button.btn-secondary" ).on( "click", function( event ) {
    document.location = '../index.html';
});

function carregarSelect() {
    axios.get('http://localhost:8080/tuctuc/cadastro')
    .then(function (response) {
        var jsonData = response.data;
        var select = $("#cadastro");

        jsonData.forEach(cadastro => {
            optionText = cadastro.nome;
            optionValue = cadastro.id;
            let optionHTML = `
            <option value="${optionValue}"> 
                ${optionText} 
            </option>`;
            select.append(optionHTML);
        });

    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
    axios.get('http://localhost:8080/tuctuc/cadastro/cliente')
    .then(function (response) {
        var jsonData = response.data;
        var select = $("#");

        jsonData.forEach(cliente => {
            optionText = cliente.nome;
            optionValue = cliente.id;
            let optionHTML = `
            <option value="${optionValue}"> 
                ${optionText} 
            </option>`;
            select.append(optionHTML);
        });

    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
    axios.get('http://localhost:8080/tuctuc/cadastro/colaborador')
    .then(function (response) {
        var jsonData = response.data;
        var select = $("#");

        jsonData.forEach(colaborador => {
            optionText = colaborador.nome;
            optionValue = colaborador.id;
            let optionHTML = `
            <option value="${optionValue}"> 
                ${optionText} 
            </option>`;
            select.append(optionHTML);
        });

    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
    axios.get('http://localhost:8080/tuctuc/cadastro/endereco')
    .then(function (response) {
        var jsonData = response.data;
        var select = $("#");

        jsonData.forEach(endereco => {
            optionText = endereco.nome;
            optionValue = endereco.id;
            let optionHTML = `
            <option value="${optionValue}"> 
                ${optionText} 
            </option>`;
            select.append(optionHTML);
        });

    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

function cadastrarCliente() {
    var nomeCompleto = $("#nomeCompleto").val();
    var cpf = $("#cpf").val();
    var rg = $("#rg").val();
    var email = $("#email").val();
    var dataNascimento = $("#dataNascimento").val();
    var genero = $("#genero").val();
    var nomeUsuario = $("#nomeUsuario").val();
    var senhaLogin = $("#senhaLogin").val();
    var situacao = $("#situacao").val();
    var celular = $("#celular").val();
    
    axios.post('http://localhost:8080/tuctuc/cadastro/cliente',
    {
        "nomeCompleto" : nomeCompleto,
        "cpf" : cpf,
        "rg" : rg,
        "email" : email,
        "dataNascimento" : dataNascimento,
        "genero" : genero,
        "nomeUsuario" : nomeUsuario,
        "senhaLogin" : senhaLogin,
        "situacao" : situacao,
        "celular" : celular,

    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "cadastro.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

cadastrarCliente(); 

function cadastrarColaborador() {
    var nome = $("#nome").val();
    var cnpj = $("#cnpj").val();
    var email = $("#email").val();
    var dataNascimento = $("#dataNascimento").val();
    var cnh = $("#cnh").val();
    var dtVenciCnh = $("#dtVenciCnh").val();
    var genero = $("#genero").val();
    var nomeUsuario = $("#nomeUsuario").val();
    var senhaLogin = $("#senhaLogin").val();
    var situacao = $("#situacao").val;
    var celular = $("#celular").val;
    var dataInicioContrato = $("#dataInicioContrato").val;
    var cpf = $("#cpf").val;
    var dataFimContrato = $("#dataFimContrato").val;
    
    axios.post('http://localhost:8080/tuctuc/cadastro/colaborador',
    {
        "nome" : nome,
        "cnpj" : cnpj,
        "email" : email,
        "dataNascimento" : dataNascimento,
        "cnh" : cnh,
        "dtVenciCnh" : dtVenciCnh,
        "genero" : genero,
        "nomeUsuario" : nomeUsuario,
        "senhaLogin" : senhaLogin,
        "situacao" : situacao,
        "celular" : celular,
        "dataInicioContrato" : dataInicioContrato,
        "cpf" : cpf,
        "dataFimContrato" : dataFimContrato,

    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "cadastro.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

cadastrarColaborador(); 

//cadastro do cliente
function cadastrarEnderecoCliente() {
    var cidade = $("#cidade").val();
    var uf = $("#uf").val();
    var cep = $("#cep").val();
    var endCompleto = $("#endCompleto").val();
    var nrCasa = $("#nrCasa").val();
    var bairro = $("#bairro").val();
    var situacao = $("#situacao").val();
    var idCliente = $("#idCliente").val();
    
    axios.post('http://localhost:8080/tuctuc/cadastro/enderecoCliente',
    {
        "cidade" : cidade,
        "uf" : uf,
        "cep" : cep,
        "endCompleto" : endCompleto,
        "nrCasa" : nrCasa,
        "bairro" : bairro,
        "situacao" : situacao,
        "idCliente" : idCliente,
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "cadastro.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

cadastrarEnderecoCliente();

//cadastro do colaborador
function cadastrarEnderecoColaborador() {
    var cidade = $("#cidade").val();
    var uf = $("#uf").val();
    var cep = $("#cep").val();
    var endCompleto = $("#endCompleto").val();
    var nrCasa = $("#nrCasa").val();
    var bairro = $("#bairro").val();
    var situacao = $("#situacao").val();
    var idCliente = $("#idCliente").val();
    
    axios.post('http://localhost:8080/tuctuc/cadastro/enderecoColaborador',
    {
        "cidade" : cidade,
        "uf" : uf,
        "cep" : cep,
        "endCompleto" : endCompleto,
        "nrCasa" : nrCasa,
        "bairro" : bairro,
        "situacao" : situacao,
        "idCliente" : idCliente,
    })
    .then(function (response) {
        alert('Informação cadastrada');
        document.location = "cadastro.html";
    })
    .catch(function (error) {
        // handle error
        console.log(error);
    });
}

cadastrarColaborador();