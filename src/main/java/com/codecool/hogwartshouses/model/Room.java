package com.codecool.hogwartshouses.model;

import lombok.Data;

@Data
public class Room {
    public static int idCounter = 0;
    private final int id = idCounter++;
    private final String name;

    public Room(String name) {
        this.name = name;
    }
}
