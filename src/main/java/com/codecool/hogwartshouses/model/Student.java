package com.codecool.hogwartshouses.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    public static int idCounter = 0;
    private final int id = idCounter++;

    public Student(String name) {
        this.name = name;
    }
}
