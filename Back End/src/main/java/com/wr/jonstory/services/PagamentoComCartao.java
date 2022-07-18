package com.wr.jonstory.services;

import com.wr.jonstory.entities.Produto;
import com.wr.jonstory.repositories.PagamentoComCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoComCartao {

    @Autowired
    private PagamentoComCartaoRepository repository;

    public List<PagamentoComCartao> findAll(){
        return repository.findAll();
    }
}
