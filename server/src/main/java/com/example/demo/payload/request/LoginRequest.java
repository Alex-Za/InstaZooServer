package com.example.demo.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "Username cannot by empty")
    private String username;
    @NotEmpty(message = "Password cannot by empty")
    private String password;

}
