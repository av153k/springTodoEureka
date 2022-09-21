package com.example.springdo.controllers;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdo.payloads.ApiResponse;
import com.example.springdo.payloads.request.RegisterRequestPayload;
import com.example.springdo.repositories.UserRepository;
import com.example.springdo.security.JwtTokenGenerator;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/apiV1/auth")
public class AuthController {
    

    @Autowired
    UserRepository userRepository;

    @Autowired
    JwtTokenGenerator jwtTokenGenerator;

    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequestPayload requestPayload) {
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

}
