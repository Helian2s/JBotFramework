package com.helian2s.jbotframework;

import java.util.concurrent.atomic.AtomicLong;

import com.helian2s.jbotframework.message.Activity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Activity greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Activity();
    }

}
