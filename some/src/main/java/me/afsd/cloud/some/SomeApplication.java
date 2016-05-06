package me.afsd.cloud.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@SpringBootApplication
@RestController
public class SomeApplication {
    @Value("${my.message}")
    private String message;

    @RequestMapping("getsome")
    public String getSome(){
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }

}
