package sewa.springpractice.mypetclinic.controllers.pet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pet")
public class PetController {

    @RequestMapping({"","/","list","list.html"})
    public String petList(){
        return "pet/list";
    }
}
