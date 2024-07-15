package com.sagar.simpleWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public   String hello(){

        return "Hello World 11sagar";
    }

    @RequestMapping("/about")
    public String About(){
        return "About";
    }

}
