package com.wr.jonstory.repositories;

import com.wr.jonstory.entities.PagamentoPix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoPixRepository extends JpaRepository<PagamentoPix, Long> {
}
