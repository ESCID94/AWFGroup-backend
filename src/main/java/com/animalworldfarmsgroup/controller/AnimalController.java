package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Animal;
import com.animalworldfarmsgroup.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    //List all objects
    @GetMapping("/animals")
    public List<Animal> listAllAnimals(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/animals")
    void addAnimal(@RequestBody Animal animal) {repository.save(animal);}

    //Get an object by id
    @GetMapping("/animalById")
    public Optional<Animal> getAnimal(@RequestBody Animal animal){ return repository.findById(animal.getId_animal());}

    //List objects by id
    @GetMapping("/animalsById")
    public List<Animal> listAnimalsByIds(@RequestBody List<Animal> animals) {
        List<Long> listIds = animals.stream().map(Animal::getId_animal).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteAnimalById")
    void deleteAnimal(@RequestBody Animal animal) {repository.delete(animal);}
}
