package com.wr.jonstory.services;


import com.wr.jonstory.entities.Cliente;
import com.wr.jonstory.repositories.ClienteRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();
    }
    /*
    public Cliente buscar(Integer id){
        Optional<Cliente> obj= repository.findOne(id);
        if (obj == null){
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                    + ", Tipo " + Cliente.class.getName());
        }
        return obj;
    }

     */
}
