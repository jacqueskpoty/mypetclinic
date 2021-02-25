package sewa.springpractice.mypetclinic.controllers.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sewa.springpractice.mypetclinic.service.OwnerService;

@Controller
@RequestMapping("owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService){
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","list","list.html"})
    public String ownerList(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owner/list";
    }
}
