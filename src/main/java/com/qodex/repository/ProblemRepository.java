package com.qodex.repository;

import com.qodex.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    // add filters here if needed later
}
