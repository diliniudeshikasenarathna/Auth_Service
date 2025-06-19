package com.example.auth_service.controller;

import com.example.auth_service.dto.AuthResponse;
import com.example.auth_service.dto.LoginRequest;
import com.example.auth_service.dto.RegisterRequest;
import com.example.auth_service.service.impl.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthServiceImpl authService;

    @PostMapping("/register")
    public ResponseEntity<String> RegisterUser(@RequestBody RegisterRequest request){
        authService.register(request);
        return ResponseEntity.ok("User registered");

    }
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> LogUser(@RequestBody LoginRequest loginRequest){
       String token=authService.login(loginRequest);
      AuthResponse response=new AuthResponse();
      response.setAccessToken(token);
      return ResponseEntity.ok(response);

    }
}
