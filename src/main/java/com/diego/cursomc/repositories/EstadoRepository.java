package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.dto.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
