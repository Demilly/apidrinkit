package com.apiback.drinkit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback.drinkit.models.Usuario;
import com.apiback.drinkit.repository.UsuarioRepository;

@Service
public  class UsuarioService implements CrudInterface<Usuario>{

    @Autowired
    private UsuarioRepository userRepository;

    public List<Usuario> findAll() {
        return userRepository.findAll();
    }

    public Optional<Usuario> save(Usuario entity) {
        return Optional.of(userRepository
        		.save(entity));
    }

    public Optional<Usuario> findById(long id) {
        return userRepository.findById(id);
    }

    public void delete(Usuario entity) {
        userRepository.delete(entity);
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    public long count() {
        return userRepository.count();
    }


}
