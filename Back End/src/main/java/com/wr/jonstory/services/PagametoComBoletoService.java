package com.wr.jonstory.services;

import com.wr.jonstory.entities.PagamentoComBoleto;
import com.wr.jonstory.entities.Produto;
import com.wr.jonstory.repositories.PagamentoComBoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagametoComBoletoService {

    @Autowired
    private PagamentoComBoletoRepository repository;

    public List<PagamentoComBoleto> findAll(){
        return repository.findAll();
    }

}
