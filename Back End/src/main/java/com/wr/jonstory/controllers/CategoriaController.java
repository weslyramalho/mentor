package com.wr.jonstory.controllers;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> find(@PathVariable Integer id){
            List<Categoria> obj = service.findAll();
            return ResponseEntity.ok().body(obj);

    }

}
