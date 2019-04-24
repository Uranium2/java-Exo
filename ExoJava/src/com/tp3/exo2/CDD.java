package com.tp3.exo2;

public class CDD extends Employee {
    public CDD(String name, float salary) {
        super(name, salary);
    }

    @Override
    public float getSalary() {
        return this.salary / 10;
    }
}
