package com.codecool.hogwartshouses.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
public class Room {
    public static int idCounter = 0;
    private final int id = idCounter++;
    private String name;
    private Collection<Student> occupants;
    private boolean dorm;

    public Room(String name, Collection<Student> occupants, boolean dorm) {
        this.occupants = occupants;
        this.name = name;
        this.dorm = dorm;
    }
}
