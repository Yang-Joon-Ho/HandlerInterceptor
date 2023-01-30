package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        log.info("=========== controller ===========");
        return "hello " + name;
    }
}
