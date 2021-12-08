package com.codecool.hogwartshouses.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Room {
    public static int idCounter = 0;
    private final int id = idCounter++;
    private String name;

    public Room(String name) {
        this.name = name;
    }
}
