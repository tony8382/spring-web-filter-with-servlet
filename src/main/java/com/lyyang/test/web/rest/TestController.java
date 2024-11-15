package com.lyyang.test.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class TestController {
    @GetMapping("a")
    public boolean test() {
        return false;
    }
}
