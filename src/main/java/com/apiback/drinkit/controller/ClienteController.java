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

import com.apiback.drinkit.models.Cliente;
import com.apiback.drinkit.service.ClienteService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@ApiOperation(value = "Retorna uma lista de todos os Usuarios")
	@GetMapping("/clientes")
	public List<Cliente> getUsers() {
		return clienteService.findAll();
	}

	@ApiOperation(value = "Retorna unico usuário pelo ID")
	@GetMapping("/cliente/{id}")
	public Optional<Cliente> getUserbyId(@PathVariable(value = "id") long id) {
		return clienteService.findById(id);
	}

	@ApiOperation(value = "Insere um novo usuário")
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> save(@Valid @RequestBody Cliente cliente) {
		clienteService.save(cliente);
		return ResponseEntity.ok(cliente);
	}

	@ApiOperation(value = "Atualiza um usuário")
	@PutMapping("/cliente")
	public ResponseEntity update(@Valid @RequestBody Cliente cliente) {
		clienteService.save(cliente);
		return ResponseEntity.ok().body(cliente);
	}

	@ApiOperation(value = "Deleta um usuário")
	@DeleteMapping("/cliente")
	public ResponseEntity<String> delete(@Valid @RequestBody Cliente cliente) {
		clienteService.delete(cliente);
		return ResponseEntity.ok().body("User excluded ID: " + cliente.getCod_cliente());
	}

	@ApiOperation(value = "Deleta um usuário pelo ID")
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		clienteService.deleteById(id);
		return ResponseEntity.ok().body("User excluded ID: " + id);
	}

}
