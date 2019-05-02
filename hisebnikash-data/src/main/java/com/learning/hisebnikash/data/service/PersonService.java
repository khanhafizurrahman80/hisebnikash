package com.learning.hisebnikash.data.service;

import com.learning.hisebnikash.data.domain.Person;
import com.learning.hisebnikash.data.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson(){
        List<Person> persons = new ArrayList<>();
        personRepository.findAll()
        .forEach(persons::add);
        return persons;
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }
}
