package com.Willis.miniweb;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String greet(){
        return "Welcome to Web Project";
    }
}
