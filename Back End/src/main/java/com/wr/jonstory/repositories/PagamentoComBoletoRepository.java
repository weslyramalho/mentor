package com.wr.jonstory.repositories;

import com.wr.jonstory.entities.PagamentoComBoleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoComBoletoRepository extends JpaRepository<PagamentoComBoleto, Integer> {
}
