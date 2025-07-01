package com.qodex.dto;

import lombok.*;
import java.util.Set;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProblemDto {
    private String title;
    private String description;
    private String difficulty;
    private String company;
    private Set<String> tags;
    private int maxScore;
}
