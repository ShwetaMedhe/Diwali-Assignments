package com.demo.test;

import com.demo.bean.Student;
import com.demo.exception.LowAttendanceException;
import com.demo.service.StudentService;
import com.demo.serviceimpl.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();

        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display Students Sorted by Attendance");
            System.out.println("4. Save Students to File");
            System.out.println("5. Load Students from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Roll No: ");
                        int roll = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        System.out.print("Enter Attendance (%): ");
                        double attendance = sc.nextDouble();
                        System.out.print("Enter Score: ");
                        double score = sc.nextDouble();
                        sc.nextLine(); // consume newline

                        Student student = new Student(roll, name, course, attendance, score);
                        service.addStudent(student);
                        System.out.println("Student added successfully!");
                    } catch (LowAttendanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\nAll Students:");
                    service.displayStudents();
                    break;

                case 3:
                    System.out.println("\nStudents Sorted by Attendance:");
                    List<Student> sorted = service.getSortedStudents();
                    for (Student s : sorted) {
                        System.out.println(s);
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter filename to save: ");
                        String filename = sc.nextLine();
                        service.saveToFile(filename);
                        System.out.println("Students saved to file successfully!");
                    } catch (Exception e) {
                        System.out.println("Error saving file: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.print("Enter filename to load: ");
                        String filename = sc.nextLine();
                        service.loadFromFile(filename);
                        System.out.println("Students loaded from file successfully!");
                    } catch (Exception e) {
                        System.out.println("Error loading file: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
