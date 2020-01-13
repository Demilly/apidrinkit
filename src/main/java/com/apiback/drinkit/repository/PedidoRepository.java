package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	Pedido save(Optional<Pedido> userbyId);
}
