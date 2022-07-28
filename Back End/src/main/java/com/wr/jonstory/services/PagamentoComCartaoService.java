package com.wr.jonstory.services;

import com.wr.jonstory.entities.Pagamento;
import com.wr.jonstory.entities.PagamentoComCartao;
import com.wr.jonstory.repositories.PagamentoComCartaoRepository;
import com.wr.jonstory.repositories.PagamentoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoComCartaoService {

    @Autowired
    private PagamentoComCartaoRepository repository;

    public List<PagamentoComCartao> findAll(){
        return repository.findAll();
    }
    public Optional<PagamentoComCartao> findById(Long id){
        Optional<PagamentoComCartao> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("PagamentoComCartao não encontrada! id: "+ id
                + ", Tipo " + PagamentoComCartao.class.getName());
        }
        return obj;
    }
    public PagamentoComCartao insert(PagamentoComCartao obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("PagamentoComCartao não encontrada! id: "+ id
                    + ", Tipo " + PagamentoComCartao.class.getName());
        }
        repository.deleteById(id);
    }
    public PagamentoComCartao update(Long id, PagamentoComCartao obj){
        PagamentoComCartao entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("PagamentoComCartao não encontrada! id: "+ id
                    + ", Tipo " + PagamentoComCartao.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(PagamentoComCartao entity, PagamentoComCartao obj){

        entity.setEstado(obj.getEstado());
        entity.setPedido(obj.getPedido());
        entity.setParcelas(obj.getParcelas());
    }

}
