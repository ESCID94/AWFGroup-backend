package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Product;
import com.animalworldfarmsgroup.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/AWF-app/v1/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    //List all objects
    @GetMapping("/")
    public List<Product> listAllProducts(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/")
    void addProduct(@RequestBody Product product) {repository.save(product);}

    //Get an object by id
    @GetMapping("/productById")
    public Optional<Product> getProduct(@RequestBody Product product){ return repository.findById(product.getId_product());}

    //List objects by id
    @GetMapping("/productsById")
    public List<Product> listProductsByIds(@RequestBody List<Product> products) {
        List<Long> listIds = products.stream().map(Product::getId_product).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @PostMapping("/deleteById")
    void deleteProduct(@RequestBody Product product) {repository.delete(product);}
}