package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	Estado save(Optional<Estado> userbyId);
}