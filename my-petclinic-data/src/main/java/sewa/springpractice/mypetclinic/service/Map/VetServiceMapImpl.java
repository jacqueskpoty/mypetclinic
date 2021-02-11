package sewa.springpractice.mypetclinic.service.Map;

import org.springframework.stereotype.Service;
import sewa.springpractice.mypetclinic.model.Vet;
import sewa.springpractice.mypetclinic.service.VetService;

@Service
public class VetServiceMapImpl extends CrudServiceMapImpl<Long,Vet> implements VetService {
}
