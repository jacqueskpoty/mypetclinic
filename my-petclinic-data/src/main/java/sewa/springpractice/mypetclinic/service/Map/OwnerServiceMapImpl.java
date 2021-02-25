package sewa.springpractice.mypetclinic.service.Map;

import org.springframework.stereotype.Service;
import sewa.springpractice.mypetclinic.model.Owner;
import sewa.springpractice.mypetclinic.model.Vet;
import sewa.springpractice.mypetclinic.service.OwnerService;

@Service
public class OwnerServiceMapImpl extends CrudServiceMapImpl<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return this.findByLastName(lastName);
    }
}
