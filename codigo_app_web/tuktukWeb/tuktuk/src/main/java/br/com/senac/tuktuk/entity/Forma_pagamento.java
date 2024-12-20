package br.com.senac.tuktuk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "forma_pagamento")
public class Forma_pagamento {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_forma_pagamento;

    @Column
    private String desconto;

    @Column
    private String debito;

    @Column
    private String credito;

    @Column
    private String pix;

    @ManyToOne
    @JoinColumn(name = "id_servico_inicializado")
    private Servico_inicializado servico;

    //getters and setters
    public int getId_forma_pagamento() {
        return id_forma_pagamento;
    }

    public void setId_forma_pagamento(int id_forma_pagamento) {
        this.id_forma_pagamento = id_forma_pagamento;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Servico_inicializado getServico() {
        return servico;
    }

    public void setServico(Servico_inicializado servico) {
        this.servico = servico;
    }
    
}
