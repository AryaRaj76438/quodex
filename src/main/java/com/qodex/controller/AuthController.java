package com.qodex.controller;

import com.qodex.dto.RegisterRequest;
import com.qodex.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@ModelAttribute RegisterRequest request) {
        authService.registerUser(request);
        return "redirect:/login?registered=true"; // works only in @Controller
    }
}
