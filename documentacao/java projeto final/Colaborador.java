
import java.util.Date;

public class Colaborador extends Pessoa{
    // Atributos
    private String matricula;
    private String cargo;
    private double participacaoLucro;
    private String tipoContrato;
    private Date dtInicioCtt;
    private Date dtFimCtt;


    // Metodo construtor sem parametro
    public Colaborador () {
        super();
        this.matricula = "";
        this.cargo = "";
        this.participacaoLucro = 0;
        this.tipoContrato = "";
        this.dtInicioCtt = null;
        this.dtFimCtt = null;
    }
    // Metodo construtor com parametro
    public Colaborador (String nomeCompleto, String email, String celular, String cpf_passaporte,String rg_cnh,
    Date dtNascimento, String genero, String senhaLogin, String nomeUsuario, String situacao) {
        super(nomeCompleto, email, celular, cpf_passaporte, rg_cnh, dtNascimento, genero, senhaLogin, nomeUsuario, situacao);
        this.matricula = matricula;
        this.cargo = cargo;
        this.participacaoLucro = participacaoLucro;
        this.tipoContrato = tipoContrato;
        this.dtInicioCtt = dtInicioCtt;
        this.dtFimCtt = dtFimCtt;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getParticipacaoLucro() {
        return participacaoLucro;
    }

    public void setParticipacaoLucro(double participacaoLucro) {
        this.participacaoLucro = participacaoLucro;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Date getDtInicioCtt() {
        return dtInicioCtt;
    }

    public void setDtInicioCtt(Date dtInicioCtt) {
        this.dtInicioCtt = dtInicioCtt;
    }

    public Date getDtFimCtt() {
        return dtFimCtt;
    }

    public void setDtFimCtt(Date dtFimCtt) {
        this.dtFimCtt = dtFimCtt;
    }

    // Acoes basicas
    public String exibirDadosColaborador() {
        return "Matricula: " + matricula + "\nNome Completo: "+ getNomeCompleto() +"\nCargo: " + cargo +
                "\nParticipacao nos Lucros: " + participacaoLucro +
                "\nTipo de Contrato: " + tipoContrato + "\nData de Inicio do Contrato: " + dtInicioCtt +
                "\nData de Termino do Contrato: " + dtFimCtt;
    }

    public String exibirDadosColaboradorViagem() {
        return "Nome completo: " + getNomeCompleto();
    }
}

