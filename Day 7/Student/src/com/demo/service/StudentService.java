package com.demo.service;

import com.demo.bean.Student;
import com.demo.exception.LowAttendanceException;
import java.util.List;

public interface StudentService {
    void addStudent(Student student) throws LowAttendanceException;
    void displayStudents();
    void saveToFile(String filename) throws Exception;
    void loadFromFile(String filename) throws Exception;
    List<Student> getSortedStudents();
}
