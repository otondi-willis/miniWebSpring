package com.Willis.miniweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Web Project";
    }
}
