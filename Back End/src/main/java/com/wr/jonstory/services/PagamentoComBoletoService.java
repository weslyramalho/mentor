package com.wr.jonstory.services;

import com.wr.jonstory.entities.Pagamento;
import com.wr.jonstory.entities.PagamentoComBoleto;
import com.wr.jonstory.repositories.PagamentoComBoletoRepository;
import com.wr.jonstory.repositories.PagamentoRepository;
import com.wr.jonstory.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoComBoletoService {

    @Autowired
    private PagamentoComBoletoRepository repository;

    public List<PagamentoComBoleto> findAll(){
        return repository.findAll();
    }
    public Optional<PagamentoComBoleto> findById(Long id){
        Optional<PagamentoComBoleto> obj= repository.findById(id);
        if(obj == null){
            throw new ObjectNotFoundException("PagamentoComBoleto não encontrada! id: "+ id
                + ", Tipo " + PagamentoComBoleto.class.getName());
        }
        return obj;
    }
    public PagamentoComBoleto insert(PagamentoComBoleto obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        if (id == null){
            throw new ObjectNotFoundException("PagamentoComBoleto não encontrada! id: "+ id
                    + ", Tipo " + PagamentoComBoleto.class.getName());
        }
        repository.deleteById(id);
    }
    public PagamentoComBoleto update(Long id, PagamentoComBoleto obj){
        PagamentoComBoleto entity = repository.getReferenceById(id);
        if (id == null){
            throw new ObjectNotFoundException("PagamentoComBoleto não encontrada! id: "+ id
                    + ", Tipo " + PagamentoComBoleto.class.getName());
        }
        updataData(entity, obj);
        return repository.save(entity);
    }
    private void updataData(PagamentoComBoleto entity, PagamentoComBoleto obj){

        entity.setEstado(obj.getEstado());
        entity.setPedido(obj.getPedido());
        entity.setDataPagamento(obj.getDataPagamento());
        entity.setDataVencimento(obj.getDataVencimento());
    }

}
