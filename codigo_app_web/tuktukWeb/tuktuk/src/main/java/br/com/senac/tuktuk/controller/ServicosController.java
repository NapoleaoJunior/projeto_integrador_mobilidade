package br.com.senac.tuktuk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senac.tuktuk.entity.Servicos;
import br.com.senac.tuktuk.repository.ServicosRepository;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    private final ServicosRepository servicosRepository;

    public ServicosController(ServicosRepository servicosRepository) {
        this.servicosRepository = servicosRepository;
    }

    // Endpoint para listar todos os serviços
    @GetMapping
    public ResponseEntity<List<Servicos>> listarServicos() {
        try {
            List<Servicos> servicos = servicosRepository.findAll();
            return ResponseEntity.ok(servicos);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint para buscar serviço por ID
    @GetMapping("/{id}")
    public ResponseEntity<?> obterPorId(@PathVariable int id) {
        Optional<Servicos> servico = servicosRepository.findById(id);

        return servico.map(valor -> ResponseEntity.ok(valor))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para buscar serviços com valor maior ou igual ao informado
    @GetMapping("/valor-servico/{valorServico}")
    public ResponseEntity<?> getByValorServico(@PathVariable float valorServico) {
        try {
            List<Servicos> servicos = servicosRepository.findByValorServicoGreaterThanEqual(valorServico);
            return ResponseEntity.ok(servicos);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao buscar serviços: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint para salvar novo serviço
    @PostMapping
    public ResponseEntity<?> salvarServico(@RequestBody Servicos servicos) {
        try {
            Servicos servicoSalvo = servicosRepository.save(servicos);
            return new ResponseEntity<>(servicoSalvo, HttpStatus.CREATED);
        } catch (DataIntegrityViolationException e) {
            return new ResponseEntity<>("Erro de integridade de dados: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao salvar o serviço: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint para atualizar um serviço existente
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarServico(@PathVariable int id, @RequestBody Servicos servicosAtualizados) {
        try {
            Optional<Servicos> servicoExistente = servicosRepository.findById(id);
            if (servicoExistente.isPresent()) {
                Servicos servico = servicoExistente.get();
                servico.setTipo(servicosAtualizados.getTipo());
                servico.setData(servicosAtualizados.getData());
                servico.setValor_servico(servicosAtualizados.getValor_servico());
                servico.setDescricao(servicosAtualizados.getDescricao());
                servico.setHorario_inicial(servicosAtualizados.getHorario_inicial());
                servico.setHorario_fim(servicosAtualizados.getHorario_fim());
                servico.setStatus(servicosAtualizados.getStatus());
                servico.setVeiculo(servicosAtualizados.getVeiculo());
                servico.setColaborador(servicosAtualizados.getColaborador());
                servico.setCliente(servicosAtualizados.getCliente());

                servicosRepository.save(servico);
                return ResponseEntity.ok(servico);
            } else {
                return new ResponseEntity<>("Serviço não encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao atualizar o serviço: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Endpoint para excluir serviço
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarServico(@PathVariable int id) {
        try {
            Optional<Servicos> servico = servicosRepository.findById(id);
            if (servico.isPresent()) {
                servicosRepository.delete(servico.get());
                return new ResponseEntity<>("Serviço excluído com sucesso", HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>("Serviço não encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao excluir o serviço: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}