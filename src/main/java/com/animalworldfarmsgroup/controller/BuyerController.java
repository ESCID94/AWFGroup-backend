package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Buyer;
import com.animalworldfarmsgroup.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BuyerController {

    @Autowired
    private BuyerRepository repository;

    //List all objects
    @GetMapping("/buyers")
    public List<Buyer> listAllBuyers(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/buyers")
    void addBuyer(@RequestBody Buyer buyer) {repository.save(buyer);}

    //Get an object by id
    @GetMapping("/buyers/buyerById")
    public Optional<Buyer> getBuyer(@RequestBody Buyer buyer){ return repository.findById(buyer.getId_buyer());}

    //List objects by id
    @GetMapping("/buyers/buyersById")
    public List<Buyer> listBuyersByIds(@RequestBody List<Buyer> buyers) {
        List<Long> listIds = buyers.stream().map(Buyer::getId_buyer).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @DeleteMapping("/buyers/deleteBuyerById")
    void deleteBuyer(@RequestBody Buyer buyer) {repository.delete(buyer);}
}
