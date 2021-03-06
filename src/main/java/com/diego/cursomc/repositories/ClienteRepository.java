package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.dto.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
