package com.example.demo;

import com.example.demo.functions.Function1;
import com.example.demo.functions.Function2;
import com.example.demo.functions.Function3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartupRunner implements CommandLineRunner {

    private final Function2 function2;
    @Autowired
    private Function3 function3;

    //3 types of dependency injection

    //1 - Field
    @Autowired
    private Function1 function1;

    //2 - constructor
    public MyStartupRunner(Function2 function2) {
        this.function2 = function2;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started! Executing CommandLineRunner...");
        function1.sayHello();
        function2.sayMyName("Rajesh");
        function3.returnAge();
    }
}