package br.com.senac.tuktuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<CategoriaRepository,Integer> {

    public boolean existsById(Long id);

    public void deleteById(Long id);

}
