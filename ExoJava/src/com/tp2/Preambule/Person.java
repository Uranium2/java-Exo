package com.tp2.Preambule;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Person father;
    private Person mother;
    private ArrayList<Person> children;
    private boolean gender;

    public Person(String name, String surname, int age, Person father, Person mother, ArrayList<Person> children, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.gender = gender;
    }

    private void addChild(Person child) {
        if (this.children.contains(child))
            return;
        this.children.add(child);
        if (this.gender)
            child.setFather(this);
        else
            child.setMother(this);
    }

    public void addFather(Person father) {
        if (this.equals(father))
            return;
        setFather(father);
        father.addChild(this);
    }

    public void addMother(Person mother) {
        if (this.equals(mother))
            return;
        setMother(mother);
        mother.addChild(this);
    }


    public Person getFather() {
        return father;
    }

    private void setFather(Person father) {
        if (father.gender)
            this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    private void setMother(Person mother) {
        if (!mother.gender)
            return;
        this.mother = mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
