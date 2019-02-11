package com.tp2.Exo2;

import java.util.ArrayList;

public class Application {
    ArrayList<ArrayList<Mark>> marks;

    public Application() {
        this.marks = new ArrayList<>();
    }

    public void addStudent() {
        this.marks.add(new ArrayList<>());
    }

    public void removeStudent(int pos) {
        this.marks.remove(pos);
    }
    public void removeMark(Mark mark) {
        for (int i = 0; i < this.marks.size(); i++) {
            for (int j = 0; j < this.marks.get(i).size(); j++) {
                if (this.marks.get(i).get(j) == mark)
                    this.marks.get(i).remove(j);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != Application.class)
            return false;
        Application app = (Application)obj;
        for (int i = 0; i < this.marks.size(); i++) {
            for (int j = 0; j < this.marks.get(i).size(); j++) {
                if (!this.marks.get(i).get(j).equals(app.marks.get(i).get(j)))
                    return false;
            }
        }
        return true;
    }
}
