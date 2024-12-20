package br.com.senac.tuktuk.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_colaborador;  // Alterado para Long

    @Column
    private String nome;

    @Column
    private String cnpj;

    @Column
    private String email;

    @Column
    private LocalDate data_nascimento;  // Alterado para LocalDate

    @Column
    private String cnh;

    @Column
    private LocalDate dtvenci_cnh;  // Alterado para LocalDate

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

    @Column
    private LocalDate data_fimcontrato;  // Alterado para LocalDate

    @Column
    private String cpf;

    @Column
    private LocalDate data_iniciocontrato;  // Alterado para LocalDate

    // Relacionamento com Veículo
    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

    // Relacionamento com EnderecoCadastro (Muitos colaboradores podem estar associados a um único endereço)
    @ManyToOne
    @JoinColumn(name = "id_endereco", nullable = true)  // Pode ser nullable, dependendo da lógica de negócios
    private EnderecoCadastro enderecoCadastro;

    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Servicos> servicos;

    // Getters e setters
    public Long getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(Long id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public LocalDate getDtvenci_cnh() {
        return dtvenci_cnh;
    }

    public void setDtvenci_cnh(LocalDate dtvenci_cnh) {
        this.dtvenci_cnh = dtvenci_cnh;
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

    public LocalDate getData_fimcontrato() {
        return data_fimcontrato;
    }

    public void setData_fimcontrato(LocalDate data_fimcontrato) {
        this.data_fimcontrato = data_fimcontrato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_iniciocontrato() {
        return data_iniciocontrato;
    }

    public void setData_iniciocontrato(LocalDate data_iniciocontrato) {
        this.data_iniciocontrato = data_iniciocontrato;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public EnderecoCadastro getEnderecoCadastro() {
        return enderecoCadastro;
    }

    public void setEnderecoCadastro(EnderecoCadastro enderecoCadastro) {
        this.enderecoCadastro = enderecoCadastro;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }

    public Optional<Colaborador> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}


