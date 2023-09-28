package com.lcwd.mvc.Spring_MVC_Project;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Component
//@RequestMapping()
@Controller
public class SuperMan {
    // @RequestMapping is used for Mapping the URL with the method
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about Request");
        return "about";
    }
}
