package com.example.springdo.entities;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")
@Entity()
@Getter()
@Setter()
@NoArgsConstructor()
public class UserEntity {
    @Id
    private String id;
    @Email()
    private String email;
    @NotBlank()
    @Size(max = 20)
    private String userName;
    @NotBlank()
    @Size(max = 120)
    private String password;

    private String jwtToken;
}
