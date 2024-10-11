package com.example.demoauth;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
@GetMapping("/")
public String Greet() {
    return "welcome to oauth demo";
}

}
