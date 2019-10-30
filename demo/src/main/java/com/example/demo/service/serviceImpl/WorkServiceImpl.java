package com.example.demo.service.serviceImpl;

import com.example.demo.model.Work;
import com.example.demo.repository.WorkRepository;
import com.example.demo.service.WorkService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class WorkServiceImpl implements WorkService {

    private WorkRepository workRepository;

    public WorkServiceImpl(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @Override
    public Set<Work> findAll() {

        Set<Work> works = new HashSet<>();
        this.workRepository.findAll().forEach(works::add);
        return works;
    }

    @Override
    public Work findById(Integer id) {
        Optional<Work> workOptional = this.workRepository.findById(id);

        if(!workOptional.isPresent()){
            throw new RuntimeException("Work Not Found!");
        }

        return workOptional.get();
    }

    @Override
    public Work save(Work object) {
        return this.workRepository.save(object);
    }

    @Override
    public void deleteAll(Set<Work> objects) {
        this.workRepository.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        this.workRepository.deleteById(id);
    }

    @Override
    public void delete(Work object) {
        this.workRepository.delete(object);
    }
}
