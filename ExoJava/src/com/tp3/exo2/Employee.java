package com.tp3.exo2;

public abstract class Employee {
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract float getSalary();
}