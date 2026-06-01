package com.atp.ListaEx.controller;

import com.atp.ListaEx.model.ProdutoModel;
import com.atp.ListaEx.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // indica que a classe é um controller
@RequestMapping("/produtos") // defini um endpoint
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping //Mapeia requisições HTTP do tipo POST.
    public ResponseEntity<ProdutoModel> criar(@RequestBody ProdutoModel produtoModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(produtoModel));
    }

    @GetMapping //Mapeia requisições HTTP do tipo GET.
    public ResponseEntity<List<ProdutoModel>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}") //Mapeia requisições HTTP do tipo DELETE.
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
