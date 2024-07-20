package com.learningSpring.spring_boot_first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam String name) {
        return greetingService.greet(name);
    }
}