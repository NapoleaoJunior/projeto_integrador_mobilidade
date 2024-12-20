package br.com.senac.tuktuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.tuktuk.entity.EnderecoCadastro;


public interface EnderecoRepository extends JpaRepository<EnderecoCadastro, Integer> {
    
}
