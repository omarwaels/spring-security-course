package com.security.test.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    
    @GetMapping("/hello")
    String hello(){
        return "Hello Samba";
    }


}
