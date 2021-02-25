package sewa.springpractice.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sewa.springpractice.mypetclinic.model.Owner;
import sewa.springpractice.mypetclinic.model.Vet;
import sewa.springpractice.mypetclinic.service.OwnerService;
import sewa.springpractice.mypetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        Long Id = ownerService.getNextId();
        owner1.setId(Id);
        owner1.setFirstName("James");
        owner1.setLastName("Sewa");

        ownerService.save(Id,owner1);

        Owner owner2 = new Owner();
        Id = ownerService.getNextId();
        owner2.setId(Id);
        owner2.setFirstName("Tanti");
        owner2.setLastName("Ahego");

        ownerService.save(Id,owner2);

        Owner owner3 = new Owner();
        Id = ownerService.getNextId();
        owner3.setId(Id);
        owner3.setFirstName("Yuri");
        owner3.setLastName("Komal");

        ownerService.save(Id,owner3);

        Vet vet1 = new Vet();
        Id = vetService.getNextId();
        vet1.setId(Id);
        vet1.setFirstName("Santos");
        vet1.setLastName("Alinana");

        vetService.save(Id,vet1);

        Vet vet2 = new Vet();
        Id = vetService.getNextId();
        vet2.setId(2L);
        vet2.setLastName("Gaspendo");
        vet2.setLastName("Alinanana");

        vetService.save(Id,vet2);
    }
}
