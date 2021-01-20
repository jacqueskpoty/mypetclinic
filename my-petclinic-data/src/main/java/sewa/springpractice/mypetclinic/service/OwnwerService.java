package sewa.springpractice.mypetclinic.service;

import sewa.springpractice.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnwerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
