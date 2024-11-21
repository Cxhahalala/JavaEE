package com.example.demochapter02.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Value("${pet.type}")
    private String type;
    @Value("${pet.name}")
    private String name;
}
