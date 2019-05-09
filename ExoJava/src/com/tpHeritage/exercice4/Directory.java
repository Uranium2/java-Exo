package com.tpHeritage.exercice4;

import java.util.Date;
import java.util.List;

public class Directory extends FileSystem{
    List<FileSystem> dir;

    @Override
    public Integer getSize() {
        return null;
    }

    public Directory(Date date, String name, Integer size) {
        super(date, name, size);
    }

    public void listDir() {
        dir.forEach(FileSystem::print);
    }

    @Override
    public void print() {
        System.out.println("Directory Name: " + getName() +
                            " Size: " + getSize() +
                            " Date: " + getDate().toString());
    }

    public void add(FileSystem fs) {
        dir.add(fs);
        size += fs.getSize();
    }

    public void delete(FileSystem fs) {
        dir.remove(fs);
        size -= fs.getSize();
    }

}
