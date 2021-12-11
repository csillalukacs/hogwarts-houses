package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAll(){
        return studentDAO.getAll();
    }

    public void add(Student student){
        studentDAO.add(student);
    }

    public Student find(int id){
        return studentDAO.find(id);
    }

    public void delete(int id) {
        studentDAO.delete(id);
    }

    public void update(int id, Student student) {
        studentDAO.update(id, student);
    }
}
