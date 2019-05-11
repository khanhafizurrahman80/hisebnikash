package com.learning.hisebnikash.data.repositories;

import com.learning.hisebnikash.data.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by khanhafizurrahman on 11/5/19.
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
