package com.demo.bean;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
    private int rollno;
    private String sname;
    private String course;
    private double attendancePercentage;
    private double score;
    private String grade;

    
    public Student() {
    }

  
    public Student(int rollno, String sname, String course, double attendancePercentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
        this.grade = calculateGrade();
    }
    
    public int getRollno() { return rollno; }
    public String getSname() { return sname; }
    public String getCourse() { return course; }
    public double getAttendancePercentage() { return attendancePercentage; }
    public double getScore() { return score; }
    public String getGrade() { return grade; }

    
    public String calculateGrade() {
        if(score >= 90) return "A";
        else if(score >= 75) return "B";
        else if(score >= 60) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + sname + ", Course: " + course +
               ", Attendance: " + attendancePercentage + "%, Score: " + score + ", Grade: " + grade;
    }

    
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.attendancePercentage, this.attendancePercentage);
    }
}
