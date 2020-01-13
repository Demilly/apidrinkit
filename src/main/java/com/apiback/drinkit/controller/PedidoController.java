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

import com.apiback.drinkit.models.Pedido;
import com.apiback.drinkit.service.PedidoService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;

	@ApiOperation(value = "Retorna uma lista de todos os pedidos")
	@GetMapping("/pedidos")
	public List<Pedido> getPedidos() {
		return pedidoService.findAll();
	}

	@ApiOperation(value = "Retorna um pedido pelo ID")
	@GetMapping("/pedido/{id}")
	public Optional<Pedido> getPedidobyId(@PathVariable(value = "id") long id) {
		return pedidoService.findById(id);
	}

	@ApiOperation(value = "Insere um novo pedido")
	@PostMapping("/pedido")
	public ResponseEntity<Pedido> save(@Valid @RequestBody Pedido pedido) {
		pedidoService.save(pedido);
		return ResponseEntity.ok(pedido);
	}

	@ApiOperation(value = "Atualiza um pedido")
	@PutMapping("/pedido")
	public ResponseEntity update(@Valid @RequestBody Pedido pedido) {
		pedidoService.save(pedido);
		return ResponseEntity.ok().body(pedido);
	}

	@ApiOperation(value = "Deleta um pedido")
	@DeleteMapping("/pedido")
	public ResponseEntity<String> delete(@Valid @RequestBody Pedido pedido) {
		pedidoService.delete(pedido);
		return ResponseEntity.ok().body("User excluded ID: " + pedido.getCod_pedido());
	}

	@ApiOperation(value = "Deleta um pedido pelo ID")
	@DeleteMapping("/pedido/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		pedidoService.deleteById(id);
		return ResponseEntity.ok().body("User excluded ID: " + id);
	}

}
