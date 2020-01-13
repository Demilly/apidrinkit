package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	Categoria save(Optional<Categoria> userbyId);


}
