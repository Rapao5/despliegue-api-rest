package com.hellin.despliegue_api_rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellin.despliegue_api_rest.entity.Pet;
import com.hellin.despliegue_api_rest.repository.PetRepository;

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

}
