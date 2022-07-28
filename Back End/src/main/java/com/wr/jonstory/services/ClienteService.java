package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Cliente;
import com.wr.jonstory.repositories.CategoriaRepository;
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
    public Optional<Cliente> findById(Long id){
        Optional<Cliente> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Cliente não encontrada! id: "+ id
                + ", Tipo " + Cliente.class.getName());
        }
        return obj;
    }
    public Cliente insert(Cliente obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Cliente não encontrada! id: "+ id
                    + ", Tipo " + Cliente.class.getName());
        }
        repository.deleteById(id);
    }
    public Cliente update(Long id, Cliente obj){
        Cliente entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Cliente não encontrada! id: "+ id
                    + ", Tipo " + Cliente.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Cliente entity, Cliente obj){

        entity.setNome(obj.getNome());
        entity.setCnpjoucpf(obj.getCnpjoucpf());
        entity.setEmail(obj.getEmail());
        entity.setEnderco(obj.getEnderco());
        entity.setTelefone(obj.getTelefone());
        entity.setTipo(obj.getTipo());
    }

}
