package com.codecool.hogwartshouses.model;

import com.codecool.hogwartshouses.model.types.PetType;
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
    private PetType pet;

    public Student(String name, PetType pet) {
        this.name = name;
        this.pet = pet;
    }
}
