package com.wr.jonstory.repositories;

import com.wr.jonstory.entities.PagamentoComCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoComCartaoRepository extends JpaRepository<PagamentoComCartao, Long> {
}
