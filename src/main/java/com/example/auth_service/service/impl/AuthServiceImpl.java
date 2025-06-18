package com.example.auth_service.service.impl;


import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.dto.RegisterRequest;
import com.example.auth_service.repository.AuthRepository;
import com.example.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final AuthRepository authRepository;
    @Override
    public AuthResponse register(RegisterRequest request) {
    return null;
    }
}
