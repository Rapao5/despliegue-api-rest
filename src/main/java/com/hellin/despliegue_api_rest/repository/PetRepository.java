package com.hellin.despliegue_api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hellin.despliegue_api_rest.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
