package com.wr.jonstory.services;

import com.wr.jonstory.entities.Pedido;
import com.wr.jonstory.entities.Produto;
import com.wr.jonstory.repositories.PedidoRepository;
import com.wr.jonstory.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Pedido findById(Integer id){
        return repository.findById(id);
    }

    public Pedido insert(Pedido obj){
        return repository.save(obj);
    }
}
