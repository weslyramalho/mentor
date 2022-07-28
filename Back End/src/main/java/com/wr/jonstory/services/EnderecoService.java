package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Endereco;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.repositories.EnderecoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }
    public Optional<Endereco> findById(Long id){
        Optional<Endereco> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Endereco não encontrada! id: "+ id
                + ", Tipo " + Endereco.class.getName());
        }
        return obj;
    }
    public Endereco insert(Endereco obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Endereco não encontrada! id: "+ id
                    + ", Tipo " + Endereco.class.getName());
        }
        repository.deleteById(id);
    }
    public Endereco update(Long id, Endereco obj){
        Endereco entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Endereco não encontrada! id: "+ id
                    + ", Tipo " + Endereco.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Endereco entity, Endereco obj){

        entity.setLogradouro(obj.getLogradouro());
        entity.setNumero(obj.getNumero());
        entity.setCliente(obj.getCliente());
        entity.setBairro(obj.getBairro());
        entity.setCep(obj.getCep());
        entity.setCidade(obj.getCidade());
        entity.setEstado(obj.getEstado());
    }

}
