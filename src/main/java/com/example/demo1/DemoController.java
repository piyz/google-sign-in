package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String foo(){
        return "index";
    }

    @RequestMapping(value = "/restricted", method = RequestMethod.GET)
    public String bar(){
        return "restricted";
    }
}