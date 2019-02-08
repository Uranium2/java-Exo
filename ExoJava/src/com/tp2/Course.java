package com.tp2;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Student> students;

    public Course(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student))
            students.add(student);
    }
}
