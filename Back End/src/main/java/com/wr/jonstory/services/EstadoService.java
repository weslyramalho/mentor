package com.wr.jonstory.services;

import com.wr.jonstory.entities.Endereco;
import com.wr.jonstory.entities.Estado;
import com.wr.jonstory.repositories.EstadoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRespository respository;

    public List<Estado> findAll(){
        return respository.findAll();
    }

}
