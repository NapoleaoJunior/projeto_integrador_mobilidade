class Pagamento {
    // Atributos
    private double desconto;
    private double valorTotal;

    // Relacionamento de dados de outra Class
    private Servico servico;
    private FormaPagamento formaPagamento;

    // Metodo construtor sem parametro
    public Pagamento() {
        this.formaPagamento = null;
        this.desconto = 0;
        this.valorTotal = 0;
        this.servico = null;
    }

    // Metodo construtor com parametro
    public Pagamento (FormaPagamento formaPagamento, double desconto, double valorTotal, Servico servico) {
        this.formaPagamento = formaPagamento;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.servico = servico;
    }

    // Getters e Setters
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }    

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    // Acoes basicas
    
    public String pagamentoRealizado() {
        return  "\n Tipo de servico: " + getServico() + 
                "\n Forma de pagamento: " + formaPagamento + 
                "\n Desconto: " + desconto + 
                "\n Valor total: " + valorTotal;
    }
}   