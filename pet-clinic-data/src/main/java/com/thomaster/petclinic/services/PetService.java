package com.thomaster.petclinic.services;

import com.thomaster.petclinic.model.Owner;
import com.thomaster.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
