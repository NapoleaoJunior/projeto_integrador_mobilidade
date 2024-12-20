package br.com.senac.tuktuk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.tuktuk.entity.Servicos;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Integer> {
    List<Servicos> findByValorServicoGreaterThanEqual(float valorServico);
}
