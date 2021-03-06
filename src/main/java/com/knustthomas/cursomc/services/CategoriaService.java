package com.knustthomas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knustthomas.cursomc.domain.Categoria;
import com.knustthomas.cursomc.repositories.CategoriaRepository;
import com.knustthomas.cursomc.services.exeptions.ObjectNotFoundExeption;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption(
				"Objeto não encontrado Id" + id + ", Tipo: " + Categoria.class.getName()));
	}

}
