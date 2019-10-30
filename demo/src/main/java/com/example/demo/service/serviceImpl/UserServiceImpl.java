package com.example.demo.service.serviceImpl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        this.userRepository.findAll().forEach(users:: add);
        return null;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> userOptional = this.userRepository.findById(id);

        if(!userOptional.isPresent()){
            throw new RuntimeException("Patient Not Found!");
        }

        return userOptional.get();
    }

    @Override
    public User save(User object) {
        return this.userRepository.save(object);
    }

    @Override
    public void deleteAll(Set<User> objects) {
        this.deleteAll(objects);
    }

    @Override
    public void deleteById(Integer id) {
        this.deleteById(id);
    }

    @Override
    public void delete(User object) {
        this.userRepository.delete(object);
    }
}
