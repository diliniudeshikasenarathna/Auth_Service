package com.example.auth_service.dto;

import com.example.auth_service.model.User;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private User userRole;
}
