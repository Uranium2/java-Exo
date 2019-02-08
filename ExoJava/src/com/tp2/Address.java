package com.tp2;

public class Address implements Cloneable {
    int num;
    String sheet;

    public Address(int num, String sheet) {
        this.num = num;
        this.sheet = sheet;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
