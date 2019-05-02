package com.learning.hisebnikash.web.bootstrap;

import com.learning.hisebnikash.data.domain.Person;
import com.learning.hisebnikash.data.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import static java.time.LocalDate.now;

/**
 * Created by khanhafizurrahman on 2/5/19.
 */
@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private Logger log = LoggerFactory.getLogger(SpringJpaBootstrap.class);

    @Autowired
    private PersonRepository personRepository;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadPersons();
    }

    private void loadPersons() {
        log.info("loadPerson started!");
        Person person = new Person("mahmudul", "hasan", "mh@gmail.com", now());
        personRepository.save(person);
    }
}
