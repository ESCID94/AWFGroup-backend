package com.animalworldfarmsgroup.controller;

import com.animalworldfarmsgroup.model.Contact;
import com.animalworldfarmsgroup.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    //List all objects
    @GetMapping("/contacts")
    public List<Contact> listAllContacts(){
        return repository.findAll();
    }

    //Save an object
    @PostMapping("/contacts")
    void addContact(@RequestBody Contact contact) {repository.save(contact);}

    //Get an object by id
    @GetMapping("/contacts/contactById")
    public Optional<Contact> getContact(@RequestBody Contact contact){ return repository.findById(contact.getId_contact());}

    //List objects by id
    @GetMapping("/contacts/contactsById")
    public List<Contact> listContactsByIds(@RequestBody List<Contact> contacts) {
        List<Long> listIds = contacts.stream().map(Contact::getId_contact).toList();
        return repository.findAllById(listIds);
    }

    //Deletes an object
    @DeleteMapping("/contacts/deleteContactById")
    void deleteContact(@RequestBody Contact contact) {repository.delete(contact);}
}
