package br.com.senac.tuktuk.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "servico_inicializados")
public class Servico_inicializados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_svinicializados;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico_inicializados servico;

    @OneToMany(mappedBy = "id_forma_pagamento")
    private List<Forma_pagamento> formaPagamento;

    @OneToMany(mappedBy = "servico")
    private List<EnderecoCadastro> enderecoServicos;

    // gatters and setters
    public int getId_svinicializados() {
        return id_svinicializados;
    }

    public void setId_svinicializados(int id_svinicializados) {
        this.id_svinicializados = id_svinicializados;
    }

    public Servico_inicializados getServico() {
        return servico;
    }

    public void setServico(Servico_inicializados servico) {
        this.servico = servico;
    }

    public List<Forma_pagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(List<Forma_pagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<EnderecoCadastro> getEnderecoServicos() {
        return enderecoServicos;
    }

    public void setEnderecoServicos(List<EnderecoCadastro> enderecoServicos) {
        this.enderecoServicos = enderecoServicos;
    }

}
