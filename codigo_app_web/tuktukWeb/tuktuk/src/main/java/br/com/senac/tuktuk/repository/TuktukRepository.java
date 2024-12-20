package br.com.senac.tuktuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface TuktukRepository extends JpaRepository<TuktukRepository,Integer> {
    
    ArrayList<TuktukRepository> findByNomeLike(String nome);    
    
    ArrayList<TuktukRepository> findByPrecoGreaterThanEqual(float preco);

    ArrayList<TuktukRepository> findByPrecoLessThanEqual(float preco);
}