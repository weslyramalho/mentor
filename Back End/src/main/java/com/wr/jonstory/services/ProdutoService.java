package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Produto;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.repositories.ProdutoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }
    public Optional<Produto> findById(Long id){
        Optional<Produto> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Produto não encontrada! id: "+ id
                + ", Tipo " + Produto.class.getName());
        }
        return obj;
    }
    public Produto insert(Produto obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Produto não encontrada! id: "+ id
                    + ", Tipo " + Produto.class.getName());
        }
        repository.deleteById(id);
    }
    public Produto update(Long id, Produto obj){
        Produto entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Produto não encontrada! id: "+ id
                    + ", Tipo " + Produto.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Produto entity, Produto obj){

        entity.setNome(obj.getNome());
    }

}
