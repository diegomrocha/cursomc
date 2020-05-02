package com.diego.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.cursomc.dto.Cliente;
import com.diego.cursomc.exceptions.ObjectNotFoundException;
import com.diego.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
