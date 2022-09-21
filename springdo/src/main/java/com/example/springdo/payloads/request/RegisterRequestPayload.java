package com.example.springdo.payloads.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter()
@Setter()
@NoArgsConstructor()
public class RegisterRequestPayload {

    @NotBlank()
    @Size(min = 3, max = 20)
    private String userName;

    @NotBlank()
    @Email()
    private String email;

    @NotBlank()
    @Size(min = 6, max = 40)
    private String password;

}
