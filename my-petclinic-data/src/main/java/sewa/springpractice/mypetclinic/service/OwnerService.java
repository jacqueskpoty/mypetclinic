package sewa.springpractice.mypetclinic.service;

import sewa.springpractice.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
}
