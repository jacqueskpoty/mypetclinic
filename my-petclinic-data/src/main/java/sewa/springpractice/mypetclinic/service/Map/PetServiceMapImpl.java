package sewa.springpractice.mypetclinic.service.Map;

import org.springframework.stereotype.Service;
import sewa.springpractice.mypetclinic.model.Pet;
import sewa.springpractice.mypetclinic.service.PetService;

@Service
public class PetServiceMapImpl extends CrudServiceMapImpl<Pet,Long> implements PetService {

}
