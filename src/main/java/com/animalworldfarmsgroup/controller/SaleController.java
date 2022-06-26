package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Sale;
import com.animalworldfarmsgroup.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AWF-app/v1/sales")
@CrossOrigin(origins = "http://localhost:4200")
public class SaleController {

    @Autowired
    private SaleRepository repository;

    //List all objects
    @GetMapping("/")
    public List<Sale> listAllSales(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/")
    void addSale(@RequestBody Sale sale) {repository.save(sale);}

    //Get an object by id
    @GetMapping("/saleById")
    public Optional<Sale> getSale(@RequestBody Sale sale){ return repository.findById(sale.getId_sale());}

    //List objects by id
    @GetMapping("/salesById")
    public List<Sale> listSalesByIds(@RequestBody List<Sale> sales) {
        List<Long> listIds = sales.stream().map(Sale::getId_sale).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteById")
    void deleteSale(@RequestBody Sale sale) {repository.delete(sale);}
}
