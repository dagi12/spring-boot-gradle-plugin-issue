package com.example.springbootgradlepluginissue;

import org.springframework.stereotype.Controller;

@Controller
public class BarController {

    public static final String BAR = "bar";

    public BarController() {
        System.out.println(BAR);
    }

}
