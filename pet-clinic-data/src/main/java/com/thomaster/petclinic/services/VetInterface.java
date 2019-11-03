package com.thomaster.petclinic.services;

import com.thomaster.petclinic.model.Owner;
import com.thomaster.petclinic.model.Vet;

import java.util.Set;

public interface VetInterface {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
