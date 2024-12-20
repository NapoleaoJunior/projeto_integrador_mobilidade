/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tuctuc.entity;

import java.util.Date;

/**
 *
 * @author toinh
 */
public class Pessoa {

    // Atributos
    private String nome;
    private String cpf;
    private String nrCelular;
    private String email;
    private String usuario;
    private String senha;
    private Date dataCadastro;
    private String status;

    //Getters and Seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNrCelular() {
        return nrCelular;
    }

    public void setNrCelular(String nrCelular) {
        this.nrCelular = nrCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Metodo construtor para recuperação de dados
    public String getDados() {
        return getNome() + ","
                + getCpf() + ","
                + getNrCelular() + ","
                + getEmail() + ","
                + getUsuario() + ","
                + getSenha() + ","
                + getDataCadastro() + ","
                + getStatus();
    }

}
