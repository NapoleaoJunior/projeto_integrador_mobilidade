package br.com.senac.tuktuk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.tuktuk.entity.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Integer> {

    public Optional<Colaborador> findById(Long id);

    public boolean existsById(Long id);

    public void deleteById(Long id);

    public boolean isEmpty();

}
