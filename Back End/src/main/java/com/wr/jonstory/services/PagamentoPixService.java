package com.wr.jonstory.services;

import com.wr.jonstory.entities.Pagamento;
import com.wr.jonstory.entities.PagamentoPix;
import com.wr.jonstory.repositories.PagamentoPixRepository;
import com.wr.jonstory.repositories.PagamentoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoPixService {

    @Autowired
    private PagamentoPixRepository repository;

    public List<PagamentoPix> findAll(){
        return repository.findAll();
    }
    public Optional<PagamentoPix> findById(Long id){
        Optional<PagamentoPix> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("PagamentoPix não encontrada! id: "+ id
                + ", Tipo " + PagamentoPix.class.getName());
        }
        return obj;
    }
    public PagamentoPix insert(PagamentoPix obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("PagamentoPix não encontrada! id: "+ id
                    + ", Tipo " + PagamentoPix.class.getName());
        }
        repository.deleteById(id);
    }
    public PagamentoPix update(Long id, PagamentoPix obj){
        PagamentoPix entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("PagamentoPix não encontrada! id: "+ id
                    + ", Tipo " + PagamentoPix.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(PagamentoPix entity, PagamentoPix obj){

        entity.setEstado(obj.getEstado());
        entity.setPedido(obj.getPedido());
        entity.setChave(obj.getChave());
    }

}
