package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> categoria = repo.findById(id);
			
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrato " + id + " Tipo: " + Pedido.class.getName()));
		
	}
	
	
	
}
