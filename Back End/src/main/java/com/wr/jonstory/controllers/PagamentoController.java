package com.wr.jonstory.controllers;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Pagamento;
import com.wr.jonstory.services.CategoriaService;
import com.wr.jonstory.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @GetMapping
    public ResponseEntity<List<Pagamento>> findall(){
        List<Pagamento> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Pagamento>> findById(@PathVariable Long id){
        Optional<Pagamento> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Pagamento> insert(@RequestBody Pagamento obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pagamento> update(@PathVariable Long id, @RequestBody Pagamento obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
