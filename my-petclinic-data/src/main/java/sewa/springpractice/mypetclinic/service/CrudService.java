package sewa.springpractice.mypetclinic.service;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(ID id,T object);
    void delete(T object);
    void deleteById(ID id);
    Long getNextId();
}
