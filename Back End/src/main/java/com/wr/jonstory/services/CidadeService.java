package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Cidade;
import com.wr.jonstory.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repository;

    public List<Cidade> findAll(){
        return repository.findAll();
    }

}
