package com.example.demo.service;

import java.util.Set;

public interface CrudService<T,id> {

    Set<T> findAll();

    T findByid(id id);

    T save(T object);

    void deleteAll(Set<T> objects);

    void deleteById(id id);

    void delete(T object);
}
