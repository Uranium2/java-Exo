package com.tpHeritage.exercice4;

import java.util.Date;

public abstract class FileSystem {
    protected Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Integer getSize();

    protected String name;
    protected Integer size;

    public FileSystem(Date date, String name, Integer size) {
        this.date = date;
        this.name = name;
        this.size = size;
    }
    public abstract void print();
}
