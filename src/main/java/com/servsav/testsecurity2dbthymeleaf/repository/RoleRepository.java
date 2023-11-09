package com.servsav.testsecurity2dbthymeleaf.repository;

import com.servsav.testsecurity2dbthymeleaf.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
