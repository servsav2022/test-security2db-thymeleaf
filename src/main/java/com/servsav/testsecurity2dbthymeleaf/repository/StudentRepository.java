package com.servsav.testsecurity2dbthymeleaf.repository;

import com.servsav.testsecurity2dbthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
