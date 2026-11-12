package com.demo.autonomous_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "AI Autonomous CI/CD Demo";
    }

    // TEMPORARY FAILURE TEST
    @GetMapping("/test")
    public String test() {
        return unknownVariable;
    }
}



//testing with this line remvoable 
//testing with this line remvoable 

//testing with this line remvoable 


//testing with this line remvoable 
//testing with this line remvoable 

//testing with this line remvoable 