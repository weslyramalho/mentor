package com.wr.jonstory.services;

import com.wr.jonstory.entities.Cliente;
import com.wr.jonstory.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){

        return repository.findAll();
    }

    public Cliente findById(Integer id){
        return repository.findById(id);
    }

    public Cliente insert(Cliente obj){
        return repository.save(obj);
    }
}
