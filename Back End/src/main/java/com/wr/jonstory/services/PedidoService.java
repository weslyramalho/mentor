package com.wr.jonstory.services;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Pedido;
import com.wr.jonstory.repositories.PedidoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }
    public Optional<Pedido> findById(Long id){
        Optional<Pedido> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("Categoria não encontrada! id: "+ id
                + ", Tipo " + Pedido.class.getName());
        }
        return obj;
    }
    public Pedido insert(Pedido obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("Produto não encontrada! id: "+ id
                    + ", Tipo " + Pedido.class.getName());
        }
        repository.deleteById(id);
    }
    public Pedido update(Long id, Pedido obj){
        Pedido entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("Produto não encontrada! id: "+ id
                    + ", Tipo " + Pedido.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(Pedido entity, Pedido obj){
        entity.setCliente(obj.getCliente());
        entity.setInstante(obj.getInstante());
        entity.setPagamento(obj.getPagamento());
        entity.setProdutos(obj.getProdutos());
    }
    
}
