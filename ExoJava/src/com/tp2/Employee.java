package com.tp2;

public class Employee implements Cloneable {
    private String name;
    private String surname;
    private Double salary;
    private Address address;
    public Employee(String name, String surname, Double salary, Address address)
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.address = address;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.address = (Address) super.clone();
        return e;
    }
}
