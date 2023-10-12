package com.example;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private List<String> courseList;

    public Student(String name, int id) {
        this.name=name;
        this.id=id;
        courseList= new ArrayList <String>();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}
