package sewa.springpractice.mypetclinic.controllers.owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owner")
public class OwnerController {

    @RequestMapping({"","/","list","list.html"})
    public String ownerList(){
        return "owner/list";
    }
}
