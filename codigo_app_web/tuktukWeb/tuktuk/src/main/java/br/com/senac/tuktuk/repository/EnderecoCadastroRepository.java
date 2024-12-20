package br.com.senac.tuktuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.senac.tuktuk.entity.EnderecoCadastro;

@Repository
public interface EnderecoCadastroRepository extends JpaRepository<EnderecoCadastro, Integer> {

    
}

