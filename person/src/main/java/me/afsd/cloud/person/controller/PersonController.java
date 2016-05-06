package me.afsd.cloud.person.controller;

import me.afsd.cloud.person.dao.PersonDao;
import me.afsd.cloud.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person person = new Person(personName);
        personDao.save(person);
        return personDao.findAll();
    }

}
