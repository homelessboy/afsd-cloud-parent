package me.afsd.cloud.person.controller;

import me.afsd.cloud.person.dao.PersonDao;
import me.afsd.cloud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = {"list",""},method = RequestMethod.GET)
    public List<Person> list(){
        return personDao.findAll();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Person get(@PathVariable Long id){
        return personDao.findOne(id);
    }

}
