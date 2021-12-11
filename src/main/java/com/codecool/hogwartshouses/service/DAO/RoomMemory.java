package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class RoomMemory implements RoomDAO {

    private final Collection<Room> rooms;

    public RoomMemory(Collection<Room> rooms) {
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

    @Override
    public Room find(int id) {
        return rooms.stream()
                .filter((room)->room.getId()==id)
                .collect(Collectors.toList()).get(0);
    }

    public Room find(String name){
        return rooms.stream()
                .filter((room)-> Objects.equals(room.getName(), name))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public void delete(int id) {
        rooms.remove(find(id));
    }

    @Override
    public void update(int id, Room newRoom) {
        Room room = find(id);
        String name = newRoom.getName();
        room.setName(name);
    }
}
