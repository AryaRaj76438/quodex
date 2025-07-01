package com.qodex.controller;

import com.qodex.model.Problem;
import com.qodex.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ProblemController {

    private final ProblemService problemService;

    @GetMapping("/problems")
    public String problemDashboard(Model model) {
        model.addAttribute("problems", problemService.getAllProblems());
        return "problem-dashboard";
    }

    @GetMapping("/problems/{id}")
    public String solveProblem(@PathVariable Long id, Model model) {
        Problem problem = problemService.getProblemById(id);
        model.addAttribute("problem", problem);
        return "problem-solve";
    }
}
