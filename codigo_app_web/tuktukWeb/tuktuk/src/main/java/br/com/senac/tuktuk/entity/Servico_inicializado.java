package br.com.senac.tuktuk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "sevico_inicializado")
public class Servico_inicializado {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_servico_inicializado;

    @Column
    private int id_servico;

    @Column
    private int id_forma_pagamento;

    //getters and setters
    public int getId_servico_inicializado() {
        return id_servico_inicializado;
    }

    public void setId_servico_inicializado(int id_servico_inicializado) {
        this.id_servico_inicializado = id_servico_inicializado;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public int getId_forma_pagamento() {
        return id_forma_pagamento;
    }

    public void setId_forma_pagamento(int id_forma_pagamento) {
        this.id_forma_pagamento = id_forma_pagamento;
    }
    

}
