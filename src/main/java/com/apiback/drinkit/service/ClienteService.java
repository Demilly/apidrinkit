package com.apiback.drinkit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiback.drinkit.models.Cliente;
import com.apiback.drinkit.repository.ClienteRepository;

@Service
public  class ClienteService implements CrudInterface<Cliente>{

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> save(Cliente entidade) {
        return Optional.of(clienteRepository
        		.save(entidade));
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public void delete(Cliente entity) {
    	clienteRepository.delete(entity);
    }

    public void deleteById(Long id) {
    	clienteRepository.deleteById(id);
    }

    public long count() {
        return clienteRepository.count();
    }


}
