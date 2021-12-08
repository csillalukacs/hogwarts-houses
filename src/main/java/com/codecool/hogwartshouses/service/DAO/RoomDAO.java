package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;

import java.util.Collection;

public interface RoomDAO {
    void add(Room room);
    Collection<Room> getAll();
    Room find(int id);
}