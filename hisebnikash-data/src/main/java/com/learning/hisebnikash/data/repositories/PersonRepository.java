package com.learning.hisebnikash.data.repositories;

import com.learning.hisebnikash.data.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Iterable<Person> findAll();
}
