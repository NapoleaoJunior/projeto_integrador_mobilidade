package br.com.senac.tuktuk.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco_cadastro")
public class EnderecoCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEndereco;

    @Column
    private String cidade;

    @Column
    private String uf;

    @Column
    private String cep;

    @Column
    private String endCompleto;

    @Column
    private String nrCasa;

    @Column
    private String bairro;

    @Column
    private String situacao;

    // Relacionamento com Cliente
    @OneToMany(mappedBy = "enderecoCadastro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cliente> clientes = new ArrayList<>();

    // Relacionamento com Colaborador
    @OneToMany(mappedBy = "enderecoCadastro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Colaborador> colaboradores = new ArrayList<>(); // Inicializando a lista

    @ManyToOne
    @JoinColumn(name="id_servico")
    private Servico_inicializados servico;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public Servico_inicializados getServico() {
        return servico;
    }

    public void setServico(Servico_inicializados servico) {
        this.servico = servico;
    }

    // Getters e setters...
    
}
