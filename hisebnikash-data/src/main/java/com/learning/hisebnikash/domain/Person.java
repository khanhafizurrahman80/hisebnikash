package com.learning.hisebnikash.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

/**
 * Created by khanhafizurrahman on 1/5/19.
 */
@Entity
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate createdDate;

    public Person(Long id, String firstName, String lastName, String email, LocalDate createdDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
