package com.tp2.Preambule;

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

    public void removeEmployee(String name) {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getName() == name)
                employeeArrayList.remove(i);
        }
    }

    public void removeEmployee(Employee e) {
        this.employeeArrayList.remove(e);
    }

    public  boolean equals(Service s) {
        return s.name.equals(this.name) && s.employeeArrayList .equals(this.employeeArrayList);
    }

    public void print() {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            employeeArrayList.get(i).print();
        }
    }
}
