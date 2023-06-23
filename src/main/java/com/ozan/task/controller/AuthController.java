package com.ozan.task.controller;

import com.ozan.task.auth.TokenManager;
import com.ozan.task.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    private TokenManager tokenManager;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));

        return ResponseEntity.ok(tokenManager.generateToken(loginDto.getUsername()));
    }

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }
}
