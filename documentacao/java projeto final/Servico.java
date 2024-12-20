
import java.util.Date;

class Servico {
    // Atributos 
    private String osServicos;
    private String tipo;
    private String fidelidade;
    private String horarioInicial;
    private String horarioFinal;
    private Date dataSv;

    // Relacionamento de dados de outra Class
    private Cliente cliente;
    private Colaborador colaborador;
    private Veiculo veiculo;
    private Pagamento pagamento;

    // Metodo construtor sem parametro
    public Servico () {
        this.osServicos = "";
        this.tipo = "";
        this.fidelidade = "";
        this.horarioInicial = "";
        this.horarioFinal = "";
        this.dataSv = null;
        // Informacao recolhidas de outras class
        this.cliente = null;
        this.colaborador = null;
        this.veiculo = null;
        this.pagamento = null;

    }
    // Metodo construtor com parametro
    public Servico (String osServicos, String tipo, String fidelidade, String horarioInicial, String horarioFinal, Date dataSv, Cliente cliente, Colaborador colaborador, Veiculo veiculo, Pagamento pagamento) {
        this.osServicos = osServicos;
        this.tipo = tipo;
        this.fidelidade = fidelidade;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.dataSv = dataSv;
        // informacao recolhidas de outras class
        this.cliente = cliente;
        this.colaborador = colaborador;
        this.veiculo = veiculo;
        this.pagamento = pagamento;
}

    // Getters e Setters
    public String getOsServicos() {
        return osServicos;
    }

    public void setOsServicos(String osServicos) {
        this.osServicos = osServicos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(String fidelidade) {
        this.fidelidade = fidelidade;
    }

    public String getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public String getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Date getDataSv() {
        return dataSv;
    }

    public void setDataSv(Date dataSv) {
        this.dataSv = dataSv;
    }
    
    // Associando classes para servicos
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    // Acoes

    public String svEscolhidoCColaborador () {
        return  "Nome Cliente: " + getCliente().getNomeCompleto() +
                "\n Tipo do Servico: " + tipo + 
                "\n Horario de Inicio: " + horarioInicial + 
                "\n Horario previsto: " + horarioFinal + 
                "\n Nome do Motorista: " + getColaborador().getNomeCompleto() + 
                "\n Tipo de Veiculo: " + getVeiculo().getTipo() + 
                "\n Valor da corrida: " + getPagamento().getValorTotal();

    }
}