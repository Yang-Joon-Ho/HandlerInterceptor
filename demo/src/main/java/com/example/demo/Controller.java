package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        log.info("=========== hello controller ===========");
        return "hello " + name;
    }

    @GetMapping("/goodbye/{name}")
    public String auth(@PathVariable String name) {
        log.info("=========== goodbye controller ===========");
        return "goodbye : " + name;
    }
}
