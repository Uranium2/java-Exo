package com.tp3.exo2;

public abstract class Employee implements Greater<Employee> {
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }

    public abstract float getSalary();
}