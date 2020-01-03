package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	Endereco save(Optional<Endereco> userbyId);
}
