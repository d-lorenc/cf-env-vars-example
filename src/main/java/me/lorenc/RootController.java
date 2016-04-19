package me.lorenc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Value("${password}")
    private String password;
    @Value("${username}")
    private String username;

    @RequestMapping("/")
    public String home() {
        return username + ":" + password;
    }
}
