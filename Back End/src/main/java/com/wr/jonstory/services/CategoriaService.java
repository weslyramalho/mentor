package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll(){
        return repository.findAll();
    }
    public Optional<Categoria> findById(Long id){
        Optional<Categoria> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Categoria não encontrada! id: "+ id
                + ", Tipo " + Categoria.class.getName());
        }
        return obj;
    }
    public Categoria insert(Categoria obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Categoria não encontrada! id: "+ id
                    + ", Tipo " + Categoria.class.getName());
        }
        repository.deleteById(id);
    }
    public Categoria update(Long id, Categoria obj){
        Categoria entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Categoria não encontrada! id: "+ id
                    + ", Tipo " + Categoria.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Categoria entity, Categoria obj){
        entity.setNome(obj.getNome());
    }

}
