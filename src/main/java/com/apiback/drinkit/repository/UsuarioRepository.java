package com.apiback.drinkit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiback.drinkit.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario save(Optional<Usuario> userbyId);

}
