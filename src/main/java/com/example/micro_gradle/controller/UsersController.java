package com.example.micro_gradle.controller;

import com.example.micro_gradle.model.Users;
import com.example.micro_gradle.model.dto.UsersDto;
import com.example.micro_gradle.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @PostMapping
    public Users save(@RequestBody UsersDto usersDto) {
        return usersService.save(usersDto);
    }

    @GetMapping
    public Iterable<Users> getAll() {
        return usersService.getAll();
    }
}
