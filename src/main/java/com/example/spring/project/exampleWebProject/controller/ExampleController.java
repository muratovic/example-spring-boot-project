package com.example.spring.project.exampleWebProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by muratozturk on 2.01.2019.
 */
@RestController
@RequestMapping("example")
public class ExampleController {

    @GetMapping("test")
    public String getText(){
        return "Hello World!!!";
    }

}


