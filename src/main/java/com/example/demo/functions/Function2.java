package com.example.demo.functions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Function2 {

    private Function1 function1;

    @Autowired
    public Function2(Function1 function1) {
        this.function1 = function1;
    }

    public String sayMyName(String name) {
        String hello = function1.sayHello();
        System.out.println(hello + name);
        return  (hello + name);
    }
}
