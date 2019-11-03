package com.thomaster.petclinic.services;

import com.thomaster.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastname(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
