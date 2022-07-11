package com.wr.jonstory.repositories;

import com.wr.jonstory.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRespository extends JpaRepository<Estado, Integer> {
}
