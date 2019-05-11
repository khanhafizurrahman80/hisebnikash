package com.learning.hisebnikash.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by khanhafizurrahman on 11/5/19.
 */
@Data
@NoArgsConstructor
@Entity
//@Index(name = "username.idx", unique = true, columnList = "username")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
