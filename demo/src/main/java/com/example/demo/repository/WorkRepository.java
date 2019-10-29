package com.example.demo.repository;

import com.example.demo.model.Work;
import org.springframework.data.repository.CrudRepository;

public interface WorkRepository extends CrudRepository<Work,Integer> {
}
