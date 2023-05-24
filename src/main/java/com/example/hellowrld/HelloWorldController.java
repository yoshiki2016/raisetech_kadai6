package com.example.hellowrld;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        Date dt_date = new Date();
        SimpleDateFormat pattern = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
        String dt_string = pattern.format(dt_date);
        return "現在日時：" + dt_string;
    }
}
