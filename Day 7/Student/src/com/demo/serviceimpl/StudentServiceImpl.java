package com.demo.serviceimpl;

import com.demo.bean.Student;
import com.demo.exception.LowAttendanceException;
import com.demo.service.StudentService;  // <-- Correct import

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) throws LowAttendanceException {
        if(student.getAttendancePercentage() < 60) {
            throw new LowAttendanceException("Attendance less than 60% for " + student.getSname());
        }
        students.add(student);
    }

    @Override
    public void displayStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void saveToFile(String filename) throws Exception {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
        }
    }

    @Override
    public void loadFromFile(String filename) throws Exception {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (List<Student>) ois.readObject();
        }
    }

    @Override
    public List<Student> getSortedStudents() {
        Collections.sort(students);
        return students;
    }
}
