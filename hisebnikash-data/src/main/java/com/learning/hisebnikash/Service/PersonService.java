package com.learning.hisebnikash.Service;

import com.learning.hisebnikash.domain.Person;
import com.learning.hisebnikash.repositories.PersonReposiory;
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
    private PersonReposiory personReposiory;
    public List<Person> getAllPerson(){
        List<Person> persons = new ArrayList<>();
        personReposiory.findAll()
        .forEach(persons::add);
        return persons;
    }
}
