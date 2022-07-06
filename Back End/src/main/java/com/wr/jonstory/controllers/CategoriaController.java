package com.wr.jonstory.controllers;

import com.wr.jonstory.entities.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value= "/categorias")
public class CategoriaController {
    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "Camisa");
        Categoria cat2 = new Categoria(2, "Bone");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }

}
