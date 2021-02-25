package sewa.springpractice.mypetclinic.service.Map;

import sewa.springpractice.mypetclinic.service.CrudService;

import java.util.*;

public abstract class CrudServiceMapImpl<T,ID>{

    Map<ID,T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id,T object) {
        map.put(id, object);
        return object;
    }

    public void delete(T object) {
        map.entrySet().removeIf(t -> t.equals(object));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public Long getNextId(){
        return Long.valueOf(map.size())+1L;
    }
}
