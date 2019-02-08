package com.tp2;


public class Result {
    Tuple<Student, Course> studentCourseTuple;
    int note;

    public Result(Student student, Course course, int note) {
        studentCourseTuple = new Tuple<>(student, course);
        this.note = note;
    }
}
