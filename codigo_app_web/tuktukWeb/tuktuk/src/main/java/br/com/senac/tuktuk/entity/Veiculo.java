package br.com.senac.tuktuk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_veiculo;

    @Column
    private String tipo;

    @Column
    private String patrimonio;

    @Column
    private String descricao;

    @Column
    private String doc_veiculo;

    @OneToMany(mappedBy = "veiculo") // Um veículo pode ter vários colaboradores
    private List<Colaborador> colaboradores; // Lista de colaboradores que usam esse veículo

    // Getters and setters
    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDoc_veiculo() {
        return doc_veiculo;
    }

    public void setDoc_veiculo(String doc_veiculo) {
        this.doc_veiculo = doc_veiculo;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
}
