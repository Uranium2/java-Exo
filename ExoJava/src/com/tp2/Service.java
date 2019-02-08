package com.tp2;

import java.util.ArrayList;

public class Service {
    String name;
    ArrayList<Employee> employeeArrayList;


    public Service(String name, ArrayList<Employee> employeeArrayList) {
        this.name = name;
        this.employeeArrayList = employeeArrayList;
    }

    public void addEmployee(Employee e) {
        this.employeeArrayList.add(e);
    }

    public  boolean equals(Service s) {
        return s.name.equals(this.name) && s.employeeArrayList .equals(this.employeeArrayList);
    }
}
