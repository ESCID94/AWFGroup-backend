package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Farm;
import com.animalworldfarmsgroup.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AWF-app/v1/farms")
@CrossOrigin(origins = "http://localhost:4200")
public class FarmController {

    @Autowired
    private FarmRepository repository;

    //List all objects
    @GetMapping("/")
    public List<Farm> listAllFarms(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/")
    void addFarm(@RequestBody Farm farm) {repository.save(farm);}

    //Get an object by id
    @GetMapping("/farmById")
    public Optional<Farm> getFarm(@RequestBody Farm farm){ return repository.findById(farm.getId_farm());}

    //List objects by id
    @GetMapping("/farmsById")
    public List<Farm> listFarmsByIds(@RequestBody List<Farm> farms) {
        List<Long> listIds = farms.stream().map(Farm::getId_farm).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteById")
    void deleteFarm(@RequestBody Farm farm) {repository.delete(farm);}
}
