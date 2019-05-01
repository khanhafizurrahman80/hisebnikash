package com.example.spring.learning.Controller;

import com.learning.hisebnikash.Service.PersonService;
import com.learning.hisebnikash.domain.Person;
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
