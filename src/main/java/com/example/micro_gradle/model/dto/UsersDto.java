package com.example.micro_gradle.model.dto;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class UsersDto {

    String name;
    String email;

}
