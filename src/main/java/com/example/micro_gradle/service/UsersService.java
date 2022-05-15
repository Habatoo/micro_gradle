package com.example.micro_gradle.service;

import com.example.micro_gradle.model.Users;
import com.example.micro_gradle.model.dto.UsersDto;
import com.example.micro_gradle.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UserRepository userRepository;

    public Users save(UsersDto usersDto) {
        Users user = new Users()
                .setId(UUID.randomUUID().toString())
                .setName(usersDto.getName())
                .setEmail(usersDto.getEmail())
                .setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }

    public Iterable<Users> getAll() {
        return userRepository.findAll();
    }
}
