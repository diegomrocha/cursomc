package com.diego.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.cursomc.dto.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
