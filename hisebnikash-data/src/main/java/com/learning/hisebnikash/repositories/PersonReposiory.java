package com.learning.hisebnikash.repositories;

import com.learning.hisebnikash.domain.Person;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Transactional
public interface PersonReposiory extends CrudRepository<Person, Long> {
    Iterable<Person> findAll();
}
