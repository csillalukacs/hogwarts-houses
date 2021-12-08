package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public class RoomMemory implements RoomDAO {

    private final Set<Room> rooms;

    public RoomMemory(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public void add(Room room) {
        rooms.add(room);
    }

    @Override
    public Collection<Room> getAll() {
        return rooms;
    }
}
