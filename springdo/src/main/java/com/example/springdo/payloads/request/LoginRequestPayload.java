package com.example.springdo.payloads.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter()
@Setter()
@NoArgsConstructor()
public class LoginRequestPayload {
    
    @NotBlank()
    private String userName;

    @NotBlank()
    private String password;
}
