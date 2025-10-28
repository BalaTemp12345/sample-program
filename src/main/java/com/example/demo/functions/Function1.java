package com.example.demo.functions;

import org.springframework.stereotype.Component;

@Component
public class Function1 {

    public String sayHello(){
        System.out.println("Hello There!");
        return "Hello There!";
    }

}
