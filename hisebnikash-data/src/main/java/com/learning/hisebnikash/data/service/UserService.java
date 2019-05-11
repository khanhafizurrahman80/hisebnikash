package com.learning.hisebnikash.data.service;

import com.learning.hisebnikash.data.domain.User;
import com.learning.hisebnikash.data.repositories.UserRepo;
import org.springframework.stereotype.Service;

/**
 * Created by khanhafizurrahman on 11/5/19.
 */
@Service
public class UserService {

    private UserRepo userRepo;

    UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getByUsername(String username) {
        return this.userRepo.findByUsername(username);
    }

}
