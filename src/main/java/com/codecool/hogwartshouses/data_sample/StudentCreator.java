package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.StudentMemory;
import org.springframework.stereotype.Component;

@Component
public class StudentCreator {
    final StudentMemory studentMemory;

    public StudentCreator(StudentMemory studentMemory) {
        this.studentMemory = studentMemory;
        initialize();
    }

    public void initialize() {
        studentMemory.add(new Student("Hermione Granger"));
        studentMemory.add(new Student("Draco Malfoy"));
    }
}
