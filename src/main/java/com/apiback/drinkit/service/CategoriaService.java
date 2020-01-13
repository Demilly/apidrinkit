package com.apiback.drinkit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback.drinkit.models.Categoria;
import com.apiback.drinkit.repository.CategoriaRepository;

@Service
public  class CategoriaService implements CrudInterface<Categoria>{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> save(Categoria categoria) {
        return Optional.of(categoriaRepository
        		.save(categoria));
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public void delete(Categoria categoria) {
    	categoriaRepository.delete(categoria);
    }

    public void deleteById(Long id) {
    	categoriaRepository.deleteById(id);
    }

    public long count() {
        return categoriaRepository.count();
    }
}
