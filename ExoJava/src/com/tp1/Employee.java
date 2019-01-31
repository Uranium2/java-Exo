package com.tp1;

public class Employee {
    private String name;
    private String surname;
    private Double salary;
    public Employee(String name, String surname, Double salary)
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public boolean equals(Employee e) {
        return e.name.equals(this.name) && e.surname.equals(this.surname);
    }
    public boolean equals(Object o) {
        if (!(o instanceof Employee))
            return false;
        Employee emp = (Employee)o;
        return emp.surname.equals(this.surname) && emp.name.equals(this.name);
    }
}
