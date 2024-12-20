import java.util.Date;

abstract class Pessoa {
    // Atributo 
    private String  nomeCompleto;
    private String  email;
    private String  celular;
    private String  celular1;
    private String  cpf_passaporte;
    private String  rg_cnh;
    private Date    dtNascimento;
    private String  genero;
    private String  nomeUsuario;
    private String  senhaLogin;
    private String  situacao;

    // Relacionamento de dados de outra Class
    private Endereco endereco;


    // Metodo sem parametro
    public Pessoa () {
        this.nomeCompleto = "";
        this.email = "";
        this.celular = "";
        this.cpf_passaporte = "";
        this.rg_cnh = "";
        this.dtNascimento = null;
        this.genero = "";
        this.nomeUsuario = "";
        this.senhaLogin = "";
    }
    // Metodo com parametro
    public Pessoa (String nomeCompleto, String email, String celular, String cpf_passaporte,String rg_cnh,
        Date dtNascimento, String genero, String senhaLogin, String nomeUsuario, String situacao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.cpf_passaporte = cpf_passaporte;
        this.rg_cnh = rg_cnh;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
        this.nomeUsuario = nomeUsuario;
        this.senhaLogin = senhaLogin;
    }
    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCpf_passaporte() {
        return cpf_passaporte;
    }

    public void setCpf_passaporte(String cpf_passaporte) {
        this.cpf_passaporte = cpf_passaporte;
    }

    public String getRg_cnh() {
        return rg_cnh;
    }

    public void setRg_cnh(String rg_cnh) {
        this.rg_cnh = rg_cnh;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}  
