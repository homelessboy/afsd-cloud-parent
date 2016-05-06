package me.afsd.cloud.ui.service;

import me.afsd.cloud.ui.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: afsd
 * @version: ${VERSION}
 */
@FeignClient("person")
public interface PersonService {
    @RequestMapping(method = RequestMethod.GET,value = "list",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<Person> list();
}
