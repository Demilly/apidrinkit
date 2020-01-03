package com.apiback.drinkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
