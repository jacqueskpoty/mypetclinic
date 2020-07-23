package sewa.springpractice.mypetclinic.service;

import sewa.springpractice.mypetclinic.model.Vet;

import java.util.Set;

public interface IVetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
