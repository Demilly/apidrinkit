package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente save(Optional<Cliente> userbyId);

}
