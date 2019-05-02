package com.learning.hisebnikash.web.controller;

import com.learning.hisebnikash.data.service.PersonService;
import com.learning.hisebnikash.data.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/get-by-all")
    @ResponseBody
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
}
