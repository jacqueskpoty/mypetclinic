package sewa.springpractice.mypetclinic.service;

import sewa.springpractice.mypetclinic.model.Owner;

import java.util.Set;

public interface IOwnwerService {

    Owner findByLastName(String lastName);
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
