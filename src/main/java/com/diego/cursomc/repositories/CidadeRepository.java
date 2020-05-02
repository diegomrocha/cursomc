package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.dto.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
