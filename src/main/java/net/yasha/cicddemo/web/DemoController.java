package net.yasha.cicddemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "cid/ping")
    public String ping() {
        return "hello actions!";
    }
}
