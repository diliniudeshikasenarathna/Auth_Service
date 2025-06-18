package com.example.auth_service.controller;

import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.dto.RegisterRequest;
import com.example.auth_service.service.impl.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserController {
    private final AuthServiceImpl authService;

    @PostMapping("/register")
    private ResponseEntity<AuthResponse> RegisterUser(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));

    }
}
