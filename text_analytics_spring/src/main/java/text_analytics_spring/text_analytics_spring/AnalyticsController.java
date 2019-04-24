package text_analytics_spring.src.main.java.text_analytics_spring.text_analytics_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @GetMapping("/test")
    public String myGreetings(@RequestParam(value = "name", defaultValue = "World!", required = false) String name) {
        String template = "Hello, %s";
        return String.format(template, name);

    }

    
