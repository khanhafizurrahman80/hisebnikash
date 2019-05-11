package com.learning.hisebnikash.web.bootstrap;

import com.learning.hisebnikash.data.domain.Person;
import com.learning.hisebnikash.data.domain.User;
import com.learning.hisebnikash.data.repositories.PersonRepository;
import com.learning.hisebnikash.data.repositories.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import static java.time.LocalDate.now;

/**
 * Created by khanhafizurrahman on 2/5/19.
 */
@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = LoggerFactory.getLogger(SpringJpaBootstrap.class);

    private PersonRepository personRepository;
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    SpringJpaBootstrap(PersonRepository personRepository, UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.personRepository = personRepository;
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadPersons();

        //defualt user
        User user = userRepo.findByUsername("user");
        if (user == null) {
            userRepo.save(new User("user", this.passwordEncoder.encode("123")));
        }
    }

    private void loadPersons() {
        log.info("loadPerson started!");
        Person person = new Person("mahmudul", "hasan", "mh@gmail.com", now());
        personRepository.save(person);
    }
}
