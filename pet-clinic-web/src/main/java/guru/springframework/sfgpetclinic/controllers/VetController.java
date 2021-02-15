package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mjk on 15.02.21
 */

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
