package com.tp2.preambule;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public Student(String name, ArrayList<Course> courses) {
        this.name = name;
        this.courses = courses;
    }
}
