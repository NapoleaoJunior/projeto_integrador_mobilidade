package br.com.senac.tuktuk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senac.tuktuk.entity.EnderecoCadastro;
import br.com.senac.tuktuk.repository.EnderecoCadastroRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoCadastroController {
    private final EnderecoCadastroRepository enderecoRepository;

    public EnderecoCadastroController(EnderecoCadastroRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    // Método GET para obter todos os endereços
    @GetMapping
    public ResponseEntity<?> getEnderecos() {
        try {
            // Recupera todos os endereços da base de dados
            List<EnderecoCadastro> enderecos = enderecoRepository.findAll();
            
            // Verifica se a lista está vazia
            if (enderecos.isEmpty()) {
                return new ResponseEntity<>("Nenhum endereço encontrado.", HttpStatus.NO_CONTENT);
            }
    
            // Retorna a lista de endereços com sucesso
            return new ResponseEntity<>(enderecos, HttpStatus.OK);
        } catch (Exception e) {
            // Log do erro para depuração
            e.printStackTrace();
            
            // Retorna um erro interno do servidor
            return new ResponseEntity<>("Erro ao recuperar os endereços: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Método GET para obter um endereço por ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getEnderecoById(@PathVariable Integer id) {
        try {
            Optional<EnderecoCadastro> endereco = enderecoRepository.findById(id);
            if (endereco.isPresent()) {
                return new ResponseEntity<>(endereco.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Endereço não encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Método POST para criar um novo endereço
    @PostMapping
    public ResponseEntity<?> createEndereco(@RequestBody EnderecoCadastro endereco) {
        try {
            EnderecoCadastro novoEndereco = enderecoRepository.save(endereco);
            return new ResponseEntity<>(novoEndereco, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Método PUT para atualizar um endereço existente
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizaEndereco(@PathVariable int id, @RequestBody EnderecoCadastro enderecoAtualizado) {
        try {
            Optional<EnderecoCadastro> enderecoOptional = enderecoRepository.findById(id);
            if (enderecoOptional.isPresent()) {
                EnderecoCadastro enderecoExistente = enderecoOptional.get();
                enderecoExistente.setCidade(enderecoAtualizado.getCidade());
                enderecoExistente.setUf(enderecoAtualizado.getUf());
                enderecoExistente.setCep(enderecoAtualizado.getCep());
                enderecoExistente.setEndCompleto(enderecoAtualizado.getEndCompleto());
                enderecoExistente.setNrCasa(enderecoAtualizado.getNrCasa());
                enderecoExistente.setBairro(enderecoAtualizado.getBairro());
                enderecoExistente.setSituacao(enderecoAtualizado.getSituacao());
                enderecoRepository.save(enderecoExistente);
                return new ResponseEntity<>(enderecoExistente, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Endereço não encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
