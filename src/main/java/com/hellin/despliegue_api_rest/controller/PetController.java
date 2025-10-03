package com.hellin.despliegue_api_rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellin.despliegue_api_rest.entity.Pet;
import com.hellin.despliegue_api_rest.repository.PetRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PetController {

    private PetRepository petRepository;

    public PetController(PetRepository petRepository){
        this.petRepository = petRepository;
    }
    @GetMapping("/list")
    public List<Pet> hello(){
        return petRepository.findAll();
    }
    @PostMapping("/adopt/{id}")
    public Pet adopt(@RequestBody long id) {
       Pet pet= petRepository.findById(id).get();
       pet.setAdopt(true);
       return petRepository.save(pet);
    }
}
