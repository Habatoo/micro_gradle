package com.example.micro_gradle.repository;

import com.example.micro_gradle.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
