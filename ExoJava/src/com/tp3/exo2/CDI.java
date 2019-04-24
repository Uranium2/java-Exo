package com.tp3.exo2;

public class CDI extends Employee{
    public CDI(String name, float salary) {
        super(name, salary);
    }

    @Override
    public float getSalary() {
        return this.salary * 10;
    }
}
