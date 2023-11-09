package com.servsav.testsecurity2dbthymeleaf.repository;

import com.servsav.testsecurity2dbthymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByEmail(String email);
}
