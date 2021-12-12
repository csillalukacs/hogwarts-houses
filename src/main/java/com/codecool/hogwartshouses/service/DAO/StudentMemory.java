package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class StudentMemory implements StudentDAO {
    Collection<Student> students;

    public StudentMemory(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public Collection<Student> getAll() {
        return students;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    public Student find(String name){
        return students.stream()
                .filter((student)-> Objects.equals(student.getName(), name))
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, Student newStudent) {

    }
}
