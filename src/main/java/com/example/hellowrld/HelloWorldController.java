package com.example.hellowrld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/time")
    public String time() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String nowString = dtformat.format(now);
        return "現在日時：" + nowString;
    }
}
