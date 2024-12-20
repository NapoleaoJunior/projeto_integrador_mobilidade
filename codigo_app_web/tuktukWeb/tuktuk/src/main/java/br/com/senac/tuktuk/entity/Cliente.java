package br.com.senac.tuktuk.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    @Column
    private String nome_completo;  

    @Column
    private String cpf;
    
    @Column
    private String rg;
    
    @Column
    private String email;
    
    @Column
    private Date data_nascimento;
    
    @Column
    private String genero;
    
    @Column
    private String nome_usuario;
    
    @Column
    private String senha_login;
    
    @Column
    private String situacao;
    
    @Column
    private String celular;

    // Relacionamento com EnderecoCadastro (muitas instâncias de Cliente podem estar associadas a um Endereço)
    @ManyToOne
    @JoinColumn(name = "id_endereco")  // Define a chave estrangeira
    private EnderecoCadastro enderecoCadastro;

    @OneToMany(mappedBy="cliente")
    private List<Servicos> servicos;

    // Getters e setters
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_login() {
        return senha_login;
    }

    public void setSenha_login(String senha_login) {
        this.senha_login = senha_login;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }

    public EnderecoCadastro getEnderecoCadastro() {
        return enderecoCadastro;
    }

    public void setEnderecoCadastro(EnderecoCadastro enderecoCadastro) {
        this.enderecoCadastro = enderecoCadastro;
    }
}
