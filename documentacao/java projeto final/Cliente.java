import java.util.Date;

class Cliente extends Pessoa {
    // Atributos
    private String codCliente;
    private String situacao;

    // Relacionamento de dados de outra class
    private Endereco endereco;
    
    // Metodo construtor sem parametro
    public Cliente () {
        super();
        this.codCliente = "";
        this.situacao = "";
        this.endereco = null;
    }

    // Metodo construtor com parametro
    public Cliente (String codCliente, String nomeCompleto, String email, String celular, String cpf_passaporte,String rg_cnh,
        Date dtNascimento, String genero, String senhaLogin, String nomeUsuario, String situacao, Endereco endereco) {
        super(nomeCompleto, email, celular, cpf_passaporte, rg_cnh, dtNascimento, genero, senhaLogin, nomeUsuario, situacao);
        this.codCliente = codCliente;
        this.situacao = situacao;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Ações basicas
    public String exibirDadosCliente() {
        return  "Codigo do Cliente: " + getCodCliente() + 
                "\nNome completo: " + getNomeCompleto() + 
                "\nCPF: " + getCpf_passaporte() + 
                "\nGenero: " + getGenero();
    }

    public String exibirEndCliente () {
        return "\nNome Cliente: " + getNomeCompleto() + "Bairro Cliente: " + getEndereco().getBairro() + "\nRua : " +  getEndereco().getEndCompleto() + "\nNumero da Casa: " + getEndereco().getNrCasa() + "\nCep: " + getEndereco().getCep();
    }

}