CREATE DATABASE tuctuc;

USE tuctuc;

CREATE TABLE cliente ( 
	 id_cliente INT PRIMARY KEY AUTO_INCREMENT,  
	 nome_completo VARCHAR(100) NOT NULL DEFAULT '',  
	 cpf VARCHAR (14),  
	 rg VARCHAR (20),  
	 email VARCHAR (100),
	 data_nascimento DATE,
	 genero VARCHAR(100),
	 nome_usuario VARCHAR (100),
	 senha_login VARCHAR(100),
	 situacao VARCHAR(100),
	 celular VARCHAR(20)
);

CREATE TABLE colaborador ( 
	 id_colaborador INT PRIMARY KEY AUTO_INCREMENT,  
	 nome VARCHAR(100),
	 cnpj VARCHAR(20),
	 cpf VARCHAR (15),
	 email VARCHAR(100),
	 data_nascimento DATE,
	 cnh VARCHAR(20),
	 dtvenci_cnh DATE,
	 genero VARCHAR(100),
	 nome_usuario VARCHAR(100),
	 senha_login VARCHAR(100),
	 situacao VARCHAR(100),
	 celular VARCHAR(20),
	 data_iniciocontrato DATE,
	 data_fimcontrato DATE
 );

CREATE TABLE veiculo ( 
	 id_veiculo INT PRIMARY KEY AUTO_INCREMENT,
	 tipo VARCHAR(20),
	 patrimonio FLOAT(10,2),
	 descricao VARCHAR(100),
	 doc_veiculo VARCHAR(100),

	 -- CHAVE ESTRANGEIRA
	 id_colaborador INT,
	 FOREIGN KEY(id_colaborador) REFERENCES colaborador (id_colaborador)
 );

CREATE TABLE servico ( 
	 id_servico INT PRIMARY KEY AUTO_INCREMENT,
	 tipo VARCHAR(100),
	 data DATE,
	 valor_servico FLOAT(10,2),
	 descricao VARCHAR(100),
	 horario_inicial VARCHAR(100),
	 horario_fim VARCHAR(100),
	 status VARCHAR(45),
	 
	 -- CHAVE ESTRANGEIRA
	 id_veiculo INT,
	 id_colaborador INT,
	 id_cliente INT,
	 FOREIGN KEY(id_cliente) REFERENCES cliente (id_cliente),
	 FOREIGN KEY(id_veiculo) REFERENCES veiculo (id_veiculo),
	 FOREIGN KEY(id_colaborador) REFERENCES colaborador (id_colaborador)
 );
 
 CREATE TABLE tipo_servico (
	 id_tipo_servico  INT PRIMARY KEY AUTO_INCREMENT,
	 nome_servico VARCHAR(100),
	 valor FLOAT(10,2)
 );

CREATE TABLE endereco_cadastro ( 
	 id_endereco INT PRIMARY KEY AUTO_INCREMENT,
	 cidade VARCHAR(100),
	 uf VARCHAR(45),
	 cep VARCHAR(100),
	 end_completo VARCHAR(100),
	 nr_casa VARCHAR(100),
	 bairro VARCHAR(100),
	 situacao VARCHAR(100),
	 
	 -- CHAVE ESTRANGEIRA
	 id_cliente INT,
	 id_colaborador INT,
	 FOREIGN KEY(id_cliente) REFERENCES cliente (id_cliente),
	 FOREIGN KEY(id_colaborador) REFERENCES colaborador (id_colaborador)
 );

CREATE TABLE forma_pagamento ( 
	 id_pagamento INT PRIMARY KEY AUTO_INCREMENT,
	 desconto FLOAT (10,2),
	 debito BOOLEAN,
	 credito BOOLEAN,
	 pix BOOLEAN,
	 
	 -- chave extrangeira
	 id_servico INT,
	 FOREIGN KEY(id_servico) REFERENCES servico (id_servico)
 );
 
 CREATE TABLE servico_inicializado (
	 id_svinicializado INT PRIMARY KEY AUTO_INCREMENT,
	 id_servico INT,
	 id_pagamento INT,
	 
	  -- CHAVE ESTRANGEIRA
	 FOREIGN KEY(id_servico) REFERENCES servico (id_servico),
	 FOREIGN KEY(id_pagamento) REFERENCES forma_pagamento (id_pagamento)
 );
 
 CREATE TABLE endereco_servico (
	id_endservico INT PRIMARY KEY AUTO_INCREMENT,
    inicio_percuso VARCHAR(25),
    fim_percuso VARCHAR(25),
    
    -- CHAVE ESTRANGEIRA	
    id_svinicializado INT,
    FOREIGN KEY (id_svinicializado) REFERENCES servico_inicializado (id_svinicializado)
 );