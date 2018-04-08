package com.example.springbootgradlepluginissue;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FooController {

    public static final String FOO = "foo";

    public FooController() {
        System.out.println(FOO);
    }

}
