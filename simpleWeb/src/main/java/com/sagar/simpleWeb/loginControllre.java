package com.sagar.simpleWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginControllre {
    @RequestMapping("/login")
    public String login() {
        return "Hello World this is log in page ";

    }
}

