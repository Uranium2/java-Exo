package com.tpHeritage.excercie3;

public class Building {
    String owner;
    String address;
    Double area;

    public Building(String owner, String address, Double area) {
        this.owner = owner;
        this.address = address;
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double tax() {
        // switch on building type
        return 0.0;
    }

    public void print() {
        System.out.println("Äddress: " + getAddress() + " Owner: " + getOwner() + "" + getArea());
    }
}
