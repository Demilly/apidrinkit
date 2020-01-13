package com.apiback.drinkit.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiback.drinkit.models.Categoria;
import com.apiback.drinkit.service.CategoriaService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;

	@ApiOperation(value = "Retorna uma lista de todas as categorias")
	@GetMapping("/categorias")
	public List<Categoria> getCategorias() {
		return categoriaService.findAll();
	}

	@ApiOperation(value = "Retorna uma categoria pelo ID")
	@GetMapping("/categoria/{id}")
	public Optional<Categoria> getCategoriabyId(@PathVariable(value = "id") long id) {
		return categoriaService.findById(id);
	}

	@ApiOperation(value = "Insere uma nova categoria")
	@PostMapping("/categoria")
	public ResponseEntity<Categoria> save(@Valid @RequestBody Categoria categoria) {
		categoriaService.save(categoria);
		return ResponseEntity.ok(categoria);
	}

	@ApiOperation(value = "Atualiza uma categoria")
	@PutMapping("/categoria")
	public ResponseEntity update(@Valid @RequestBody Categoria categoria) {
		categoriaService.save(categoria);
		return ResponseEntity.ok().body(categoria);
	}

	@ApiOperation(value = "Deleta uma categoria")
	@DeleteMapping("/categoria")
	public ResponseEntity<String> delete(@Valid @RequestBody Categoria categoria) {
		categoriaService.delete(categoria);
		return ResponseEntity.ok().body("User excluded ID: " + categoria.getCod_categoria());
	}

	@ApiOperation(value = "Deleta uma categoria pelo ID")
	@DeleteMapping("/categoria/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		categoriaService.deleteById(id);
		return ResponseEntity.ok().body("User excluded ID: " + id);
	}
	
}
