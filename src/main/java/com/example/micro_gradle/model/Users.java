package com.example.micro_gradle.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Users {

    @Id
    String id;
    String name;
    String email;
    LocalDateTime createdAt;

}
