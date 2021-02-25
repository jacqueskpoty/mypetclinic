package sewa.springpractice.mypetclinic.controllers.vet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sewa.springpractice.mypetclinic.service.VetService;

@Controller
@RequestMapping("vet")
public class VetController {

    VetService vetService;

    public VetController(VetService vetService){
        this.vetService = vetService;
    }

    @RequestMapping({"","/","list","list.html"})
    public String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vet/list";
    }
}
