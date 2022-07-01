package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.User;
import com.animalworldfarmsgroup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    //Save an object
    @PostMapping("/login")
    void addUser(@RequestBody User user) {
        repository.save(user);
    }

    //List all objects
    @GetMapping("/login")
    public List<User> listAll(){
        return repository.findAll();
    }

}
