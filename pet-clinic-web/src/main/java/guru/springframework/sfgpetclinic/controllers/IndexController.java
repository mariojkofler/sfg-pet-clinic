package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mjk on 15.02.21
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index", "index.html"})
    public String index(){

        return "index";
    }
}
