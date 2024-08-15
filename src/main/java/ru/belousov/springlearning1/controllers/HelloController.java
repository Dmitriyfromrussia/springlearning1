package ru.belousov.springlearning1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController { // пишем в множественном числе

    @GetMapping("/hello")
    public String presentation() {
        return "hello-page";
    }
}
