public enum FormaPagamento {
    DEBITO(1),
    CREDITO(2),
    PIX(3),
    DINHEIRO(4);

    private int valor;

    FormaPagamento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }   
    
}
