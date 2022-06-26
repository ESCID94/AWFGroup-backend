package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Provider;
import com.animalworldfarmsgroup.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProviderController {

    @Autowired
    private ProviderRepository repository;

    //List all objects
    @GetMapping("/providers")
    public List<Provider> listAllProviders(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/providers")
    void addProvider(@RequestBody Provider provider) {repository.save(provider);}

    //Get an object by id
    @GetMapping("/providerById")
    public Optional<Provider> getProvider(@RequestBody Provider provider){ return repository.findById(provider.getId_provider());}

    //List objects by id
    @GetMapping("/providersById")
    public List<Provider> listProvidersByIds(@RequestBody List<Provider> providers) {
        List<Long> listIds = providers.stream().map(Provider::getId_provider).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteProviderById")
    void deleteProvider(@RequestBody Provider provider) {repository.delete(provider);}
}
