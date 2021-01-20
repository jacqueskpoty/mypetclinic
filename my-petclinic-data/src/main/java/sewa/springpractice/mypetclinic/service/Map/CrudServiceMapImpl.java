package sewa.springpractice.mypetclinic.service.Map;

import sewa.springpractice.mypetclinic.service.CrudService;

import java.util.*;

public abstract class CrudServiceMapImpl<T,ID> implements CrudService<T,ID>{

    Map<ID,T> map = new HashMap<>();
    @Override
    public Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(ID id,T object) {
        map.put(id, object);
        return object;
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(t -> t.equals(object));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}
