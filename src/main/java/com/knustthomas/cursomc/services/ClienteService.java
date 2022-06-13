package com.knustthomas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knustthomas.cursomc.domain.Cliente;
import com.knustthomas.cursomc.repositories.ClienteRepository;
import com.knustthomas.cursomc.services.exeptions.ObjectNotFoundExeption;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption(
				"Objeto não encontrado Id" + id + ", Tipo: " + Cliente.class.getName()));
	}

}
