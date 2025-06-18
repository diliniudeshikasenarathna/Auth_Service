package com.example.auth_service.dto;

import com.example.auth_service.model.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private UserRoles userRole;
}
