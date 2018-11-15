package net.blitzstein.example.awsdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "I am the index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello back to you";
    }
}
