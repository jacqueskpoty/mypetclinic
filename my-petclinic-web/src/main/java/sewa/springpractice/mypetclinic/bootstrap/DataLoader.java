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
        owner1.setId(1L);
        owner1.setFirstName("James");
        owner1.setLastName("Sewa");

        ownerService.save(owner1,1L);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Tanti");
        owner1.setLastName("Ahego");

        ownerService.save(owner1,2L);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Santos");
        vet1.setLastName("Alinana");

        vetService.save(vet1,1L);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Gaspendo");
        vet2.setLastName("Alinanana");

        vetService.save(vet2,2L);
    }
}
