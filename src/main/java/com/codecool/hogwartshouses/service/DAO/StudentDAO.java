package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Student;

import java.util.Collection;


public interface StudentDAO {
    void add(Student student);
    Collection<Student> getAll();
    Student find(int id);
    void delete(int id);
    void update(int id, Student newStudent);
}
