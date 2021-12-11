package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.RoomDAO;
import com.codecool.hogwartshouses.service.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;
    @Autowired
    private StudentDAO studentDAO;

    public Collection<Room> getAll(){
        return roomDAO.getAll();
    }

    public void add(Room room){
        roomDAO.add(room);
    }

    public Room find(int id){
        return roomDAO.find(id);
    }


    public void delete(int id) {
        roomDAO.delete(id);
    }

    public void update(int id, Room newRoom) {
        roomDAO.update(id, newRoom);
    }

    public void assignStudent(Room room, Student student){
        if (room.isDorm()){
            room.getOccupants().add(student);
        }
    }
}
