package me.afsd.cloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.afsd.cloud.ui.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@Service
public class PersonHystrixService {
    @Autowired
    PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<Person> list(){
        List<Person> list=personService.list();
        return list;
    }

    public List<Person> fallbackSave(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("error"));
        return list;
    }
}
