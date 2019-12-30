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

import com.apiback.drinkit.models.Usuario;
import com.apiback.drinkit.service.UsuarioService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService userService;
    
	@ApiOperation(value = "Retorna uma lista de todos os Usuarios")
    @GetMapping("/usuario")
    public List<Usuario> getUsers() {
        return userService.findAll();
    }
	
	@ApiOperation(value = "Retorna unico usuário pelo ID")
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> getUserbyId(@PathVariable(value = "id") long id) {
		return userService.findById(id);
	}
	
	@ApiOperation(value = "Insere um novo usuário")
    @PostMapping("/usuario")
    public ResponseEntity<Usuario>
    save(@Valid @RequestBody Usuario user) {
        userService.save(user);
        return ResponseEntity.ok(user);
    }

	@ApiOperation(value = "Atualiza um usuário")
    @PutMapping("/usuario")
    public ResponseEntity update(@Valid @RequestBody Usuario user) {
        userService.save(user);
        return ResponseEntity.ok().body(user);
    }

	
	@ApiOperation(value = "Deleta um usuário")
    @DeleteMapping("/usuario")
    public ResponseEntity<String> delete(@Valid @RequestBody Usuario user) {
        userService.delete(user);
       return  ResponseEntity.ok().body("User excluded ID: " + user.getCod_usuario());
    }
	
	@ApiOperation(value = "Deleta um usuário pelo ID")
    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok().body("User excluded ID: " + id);
    }

}
