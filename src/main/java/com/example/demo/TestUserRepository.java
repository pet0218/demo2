package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TestUserRepository extends CrudRepository<TestUser, Long> {
    // Ak potrebujete nejaké špecifické metódy
}