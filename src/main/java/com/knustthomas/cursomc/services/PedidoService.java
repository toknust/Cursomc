package com.knustthomas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knustthomas.cursomc.domain.Pedido;
import com.knustthomas.cursomc.repositories.PedidoRepository;
import com.knustthomas.cursomc.services.exeptions.ObjectNotFoundExeption;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption(
				"Objeto não encontrado Id" + id + ", Tipo: " + Pedido.class.getName()));
	}

}
