package com.springproject.sample.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/msg")
    public String printMessage(@RequestParam(value="name")String name){
        return "hello "+name;
    }

    @RequestMapping("/msg/{id}")
    public String printMessage2(@PathVariable("id") int id2){
        return "hello "+id2;
    }
}
