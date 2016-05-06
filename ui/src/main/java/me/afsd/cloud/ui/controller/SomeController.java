package me.afsd.cloud.ui.controller;

import me.afsd.cloud.ui.domain.Person;
import me.afsd.cloud.ui.service.PersonHystrixService;
import me.afsd.cloud.ui.service.SomeHystixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@RestController
@RequestMapping("/some")
public class SomeController {

    @Autowired
    SomeHystixService someHystixService;
    @Autowired
    PersonHystrixService personHystrixService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getSome(){
        System.out.println("in");
//        return "some";
        String str=someHystixService.getSome();
        return str;
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }

    @RequestMapping(value = "list")
    public List<Person> list(){
        return personHystrixService.list();
    }
}
