package com.joaogodoi.hruser.repositories;

import com.joaogodoi.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
