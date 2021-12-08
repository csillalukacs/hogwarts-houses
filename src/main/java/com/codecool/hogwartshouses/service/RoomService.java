package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;

    public Collection<Room> getAll(){
        return roomDAO.getAll();
    }

    public void add(Room room){
        roomDAO.add(room);
    }

    public Room find(int id){
        return roomDAO.find(id);
    }
}
