package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Sector;
import com.animalworldfarmsgroup.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SectorController {

    @Autowired
    private SectorRepository repository;

    //List all objects
    @GetMapping("/sectors")
    public List<Sector> listAllSectors(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/sectors")
    void addSector(@RequestBody Sector sector) {repository.save(sector);}

    //Get an object by id
    @GetMapping("/sectors/sectorById")
    public Optional<Sector> getSector(@RequestBody Sector sector){ return repository.findById(sector.getId_sector());}

    //List objects by id
    @GetMapping("/sectors/sectorsById")
    public List<Sector> listSectorsByIds(@RequestBody List<Sector> sectors) {
        List<Long> listIds = sectors.stream().map(Sector::getId_sector).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @DeleteMapping("/sectors/deleteSectorById")
    void deleteSector(@RequestBody Sector sector) {repository.delete(sector);}
}
