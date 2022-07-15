package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria findById(Integer id){
        return repository.findById(id);
    }

    public Categoria insert(Categoria obj){
        return repository.save(obj);
    }
}
