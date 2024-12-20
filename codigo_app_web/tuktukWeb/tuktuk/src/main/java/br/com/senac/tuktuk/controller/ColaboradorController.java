package br.com.senac.tuktuk.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senac.tuktuk.entity.Colaborador;
import br.com.senac.tuktuk.entity.EnderecoCadastro;
import br.com.senac.tuktuk.repository.ColaboradorRepository;
import br.com.senac.tuktuk.repository.EnderecoCadastroRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    private final ColaboradorRepository colaboradorRepository;
    @SuppressWarnings("unused")
    private final EnderecoCadastroRepository enderecoCadastroRepository; // Corrigido

    // Injeção dos repositórios
    public ColaboradorController(ColaboradorRepository colaboradorRepository, EnderecoCadastroRepository enderecoCadastroRepository) {
        this.colaboradorRepository = colaboradorRepository;
        this.enderecoCadastroRepository = enderecoCadastroRepository; // Corrigido
    }

    // Método GET para listar todos os colaboradores
    @GetMapping
    public ResponseEntity<List<Colaborador>> getAllColaboradores() {
        try {
            return ResponseEntity.ok(colaboradorRepository.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Método POST para criar um novo colaborador
    @PostMapping
    public ResponseEntity<Colaborador> addColaborador(@Valid @RequestBody Colaborador colaborador, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        try {
            EnderecoCadastro endereco = verificarEndereco(colaborador.getEnderecoCadastro());
                        colaborador.setEnderecoCadastro(endereco);
                        Colaborador novoColaborador = colaboradorRepository.save(colaborador);
                        return ResponseEntity.status(HttpStatus.CREATED).body(novoColaborador);
                    } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
                    }
                }
            
                private EnderecoCadastro verificarEndereco(EnderecoCadastro enderecoCadastro) {

                    throw new UnsupportedOperationException("Unimplemented method 'verificarEndereco'");
                }
            
                // Método PUT para atualizar um colaborador existente
    @PutMapping("/{id}")
    public ResponseEntity<Colaborador> updateColaborador(@PathVariable Long id, @Valid @RequestBody Colaborador colaborador, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        try {
            if (!colaboradorRepository.existsById(id)) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            EnderecoCadastro endereco = verificarEndereco(colaborador.getEnderecoCadastro());
            colaborador.setEnderecoCadastro(endereco);
            colaborador.setId_colaborador(id); // Corrigido para camelCase

            Colaborador colaboradorAtualizado = colaboradorRepository.save(colaborador);
            return ResponseEntity.ok(colaboradorAtualizado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Método DELETE para excluir um colaborador
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteColaborador(@PathVariable Long id) {
        try {
            if (colaboradorRepository.existsById(id)) {
                colaboradorRepository.deleteById(id);
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
