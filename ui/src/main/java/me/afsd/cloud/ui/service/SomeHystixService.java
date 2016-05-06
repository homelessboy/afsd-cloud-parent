package me.afsd.cloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@Service
public class SomeHystixService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackSome")
    public String getSome(){
        String str=restTemplate.getForObject("http://some/getsome", String.class);
        return str;
    }

    public String fallbackSome(){
        return "some service 模块故障";
    }
}
