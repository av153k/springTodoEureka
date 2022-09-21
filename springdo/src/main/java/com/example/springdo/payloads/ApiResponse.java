package com.example.springdo.payloads;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter()
@Setter()
@NoArgsConstructor()
public class ApiResponse<T> implements Serializable {

    @NotNull()
    private String message;
    @NotNull()
    private String status;
    @NotNull()
    private int code;
    private T payload;
    
}
