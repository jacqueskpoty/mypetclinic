package sewa.springpractice.mypetclinic.service;

import sewa.springpractice.mypetclinic.model.Pet;

import java.util.Set;

public interface IPetService {

    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
