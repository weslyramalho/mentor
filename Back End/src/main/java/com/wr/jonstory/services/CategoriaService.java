package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
        Categoria obj = repository.findOne(id);
        if (obj == null){
         throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
                + ", Tipo " + Categoria.class.getName());
        }
        return obj;
    }
    public List<Categoria> findAll(){

        return repository.findAll();
    }

    public Categoria findById(Integer id){
        Categoria obj = repository.findById(id);
        return obj;
    }

    public Categoria insert(Categoria obj){
        return repository.save(obj);
    }
}
