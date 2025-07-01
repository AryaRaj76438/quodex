package com.qodex.controller;

import com.qodex.dto.RegisterRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "home"; // Public
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Public
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("registerRequest", new RegisterRequest());
        return "register"; // Public
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // This must NOT redirect to login
    }
}
