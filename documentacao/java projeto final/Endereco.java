
class Endereco {
    // Atributos
    private String cep;
    private String endCompleto;
    private String nrCasa;
    private String bairro;
    private String cidade;
    private String uf;
    private String situacao;

    // Metodo construtor com parametro
    public Endereco(String cep, String endCompleto, String nrCasa, String bairro, String cidade, String uf, String situacao) {
        this.cep = cep;
        this.endCompleto = endCompleto;
        this.nrCasa = nrCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.situacao = situacao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndCompleto() {
        return endCompleto;
    }

    public void setEndCompleto(String endCompleto) {
        this.endCompleto = endCompleto;
    }

    public String getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(String nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
