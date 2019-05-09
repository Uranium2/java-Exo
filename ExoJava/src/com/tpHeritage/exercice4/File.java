package com.tpHeritage.exercice4;

import java.util.Date;

public class File extends FileSystem {
    Byte data;
    public File(Date date, String name, Integer size, Byte data) {
        super(date, name, size);
        this.data = data;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("File Name: " + getName() +
                " Size: " + getSize() +
                " Date: " + getDate().toString());
    }
}
