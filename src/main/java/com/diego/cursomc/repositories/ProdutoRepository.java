package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.dto.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
