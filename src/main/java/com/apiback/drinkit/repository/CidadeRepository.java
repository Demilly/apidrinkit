package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	Cidade save(Optional<Cidade> userbyId);
}
