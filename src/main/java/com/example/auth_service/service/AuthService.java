package com.example.auth_service.service;


import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.dto.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
}
