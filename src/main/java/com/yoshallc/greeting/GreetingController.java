package com.yoshallc.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/sayhello/{name}")
    public String sayHello(@PathVariable String name){

        System.out.println(name);

        return "Hello " + name;

    }
}
