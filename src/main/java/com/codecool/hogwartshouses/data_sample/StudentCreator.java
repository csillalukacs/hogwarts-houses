package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.StudentMemory;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.stereotype.Component;

@Component
public class StudentCreator {
    final StudentMemory studentMemory;
    final RoomService roomService;

    public StudentCreator(StudentMemory studentMemory, RoomService roomService) {
        this.studentMemory = studentMemory;
        this.roomService = roomService;
        initialize();
    }

    public void initialize() {

    }
}
