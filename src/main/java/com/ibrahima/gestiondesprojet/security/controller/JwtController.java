package com.ibrahima.gestiondesprojet.security.controller;

import com.ibrahima.gestiondesprojet.security.entity.JwtResponse;
import com.ibrahima.gestiondesprojet.security.service.JwtService;
import com.ibrahima.gestiondesprojet.security.entity.JwtRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class JwtController {
    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody  JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);

    }

}
//    public JwtResponse register(RegisterRequest request) {
//        var user = User.builder()
//                .firstname(request.getFirstname())
//                .lastname(request.getLastname())
//                .email(request.getEmail())
//                .password(passwordEncoder.encode(request.getPassword()))
//                .role(Role.USER)
//                .build();
//        repository.save(user);
//        var jwtToken = jwtService.generateToken(user);
//        return JwtResponse.builder()
//                .token(jwtToken)
//                .build();
//    }
//
//    public JwtResponse authenticate(JwtRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getEmail(),
//                        request.getPassword()
//                )
//        );
//        var user = repository.findByEmail(request.getEmail())
//                .orElseThrow();
//        var jwtToken = jwtService.generateToken(user);
//        return JwtResponse.builder()
//                .token(jwtToken)
//                .build();
//    }
