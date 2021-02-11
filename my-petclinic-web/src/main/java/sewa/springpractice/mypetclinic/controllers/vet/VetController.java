package sewa.springpractice.mypetclinic.controllers.vet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vet")
public class VetController {

    @RequestMapping({"","/","list","list.html"})
    public String listVet(){
        return "vet/list";
    }
}
