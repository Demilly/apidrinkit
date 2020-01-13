package com.apiback.drinkit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback.drinkit.models.Pedido;
import com.apiback.drinkit.repository.PedidoRepository;

@Service
public class PedidoService implements CrudInterface<Pedido>{

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> save(Pedido pedido) {
        return Optional.of(pedidoRepository
        		.save(pedido));
    }

    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    public void delete(Pedido pedido) {
    	pedidoRepository.delete(pedido);
    }

    public void deleteById(Long id) {
    	pedidoRepository.deleteById(id);
    }

    public long count() {
        return pedidoRepository.count();
    }
	
}
