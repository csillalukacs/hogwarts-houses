package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class StudentMemory implements StudentDAO {
    Collection<Student> students;

    public StudentMemory(Collection<Student> students) {
        this.students = students;
        System.out.println(students.getClass());
        System.out.println(students.size());
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

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, Student newStudent) {

    }
}
