package com.apiback.drinkit.service;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T>  {

    List<T> findAll();
    Optional<T> save(T entidade);
    Optional<T> findById(Long id);
    void delete(T entidade);
    void deleteById(Long id);
    long count();


}
