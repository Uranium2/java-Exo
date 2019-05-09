package com.tpHeritage.excercie3;

public class Company extends Building {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(Integer employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    Integer employeeCounter;
    Double avg;

    public Company(String owner, String address, Double area, String name, Integer employeeCounter, Double avg) {
        super(owner, address, area);
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }

    @Override
    public Double tax() {
        return 6.30 * getArea();
    }

    @Override
    public void print() {
        System.out.println("Address: " + getAddress() +
                " Owner: " + getOwner() +
                " Area of building: " + getArea() +
                " Company name: " + getName() +
                " Number of employees: " + getEmployeeCounter() +
                " Average daily delivery: " + getAvg());
    }
}
