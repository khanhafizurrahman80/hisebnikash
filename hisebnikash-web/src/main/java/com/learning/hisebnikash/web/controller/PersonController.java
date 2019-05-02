package com.learning.hisebnikash.web.controller;

import com.learning.hisebnikash.data.service.PersonService;
import com.learning.hisebnikash.data.domain.Person;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/get-by-all")
    @ResponseBody
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @RequestMapping(value = "person", method = RequestMethod.POST)
    public void saveProduct(Person person){
        personService.addPerson(person);
    }






}
