package sewa.springpractice.mypetclinic.service.Map;

import sewa.springpractice.mypetclinic.model.Owner;
import sewa.springpractice.mypetclinic.service.OwnerService;

public class OwnerServiceMapImpl extends CrudServiceMapImpl<Owner,Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
