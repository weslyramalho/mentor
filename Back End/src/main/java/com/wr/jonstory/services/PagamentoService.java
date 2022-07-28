package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Pagamento;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.repositories.PagamentoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repository;

    public List<Pagamento> findAll(){
        return repository.findAll();
    }
    public Optional<Pagamento> findById(Long id){
        Optional<Pagamento> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Pagamento não encontrada! id: "+ id
                + ", Tipo " + Pagamento.class.getName());
        }
        return obj;
    }
    public Pagamento insert(Pagamento obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Pagamento não encontrada! id: "+ id
                    + ", Tipo " + Pagamento.class.getName());
        }
        repository.deleteById(id);
    }
    public Pagamento update(Long id, Pagamento obj){
        Pagamento entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Pagamento não encontrada! id: "+ id
                    + ", Tipo " + Pagamento.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Pagamento entity, Pagamento obj){

        entity.setEstado(obj.getEstado());
        entity.setPedido(obj.getPedido());
    }

}
