package com.example;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> studentList;

    public Course(String courseName, String courseID) {
        this.courseName=courseName;
        this.courseID=courseID;
        studentList= new ArrayList <Student>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void enrollStudent(Student newstudent) {
        studentList.add(newstudent);
    }

    // TODO: Implement methods to enroll a student and drop a student
}
