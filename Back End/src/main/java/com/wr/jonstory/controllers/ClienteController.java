package com.wr.jonstory.controllers;

import com.wr.jonstory.entities.Cliente;
import com.wr.jonstory.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> find(@PathVariable Integer id){
        List<Cliente> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }
}
