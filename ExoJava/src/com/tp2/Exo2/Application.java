package com.tp2.Exo2;

import java.util.ArrayList;

public class Application {
    ArrayList<ArrayList<Mark>> marks;

    public Application(Integer nbStudents) {
        this.marks = new ArrayList<>();
        for (int i = 0; i < nbStudents; i++) {
            this.addStudent();
        }
    }

    public void addStudent() {
        this.marks.add(new ArrayList<>());
    }

    public void removeStudent(int pos) {
        this.marks.remove(pos);
    }

    public void print() {
        System.out.println(this.toString());
    }
    public void add(int position, String subject, float value ) {
        Mark  mark = new Mark(value, subject);
        if (position < this.marks.size() && position >= 0)
            this.marks.get(position).add(mark);
    }

    public void removeMark(Mark mark) {
        for (int i = 0; i < this.marks.size(); i++) {
            for (int j = 0; j < this.marks.get(i).size(); j++) {
                if (this.getMark(i, j) == mark)
                    this.marks.get(i).remove(j);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        Application app;
        if (obj instanceof Application) {
            app = (Application)obj;
        }
        else
            return false;
        for (int i = 0; i < this.marks.size(); i++) {
            for (int j = 0; j < this.marks.get(i).size(); j++) {
                if (!this.getMark(i, j).equals(app.marks.get(i).get(j)))
                    return false;
            }
        }
        return true;
    }

    public float average(int position) {
        if (position < 0 || position > this.marks.size())
            return 0.0f;
        float sum = 0.0f;

        for (int i = 0; i < this.marks.get(position).size(); i++) {
            sum += this.getMark(position, i).getValue();
        }

        return sum / this.marks.get(position).size();
    }

    public int compute() {
        if (this.marks.isEmpty())
            return 0;
        int max = 0;
        for (int i = 0; i < this.marks.size(); i++) {
            if (this.marks.get(i).size() > max)
                max = this.marks.get(i).size();
        }
        return max - 1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.marks.size(); i++) {
            str.append("Student " + i + ": ");
            for (int j = 0; j < this.marks.get(i).size(); j++) {
                str.append(getMark(i, j).toString());
                str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public Mark getMark(int posStudent, int posMark) {
        return marks.get(posStudent).get(posMark);
    }

    public int getNbStudents() {
        return marks.size() - 1;
    }

    public int getNbMarksStudent(int pos) {
        return marks.get(pos).size() - 1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Application appClone = new Application(marks.size());
        for (int i = 0; i < marks.size(); i++) {
            for (int j = 0; j < marks.get(i).size(); j++) {
                appClone.add(i, marks.get(j).get(j).getSubject(), marks.get(i).get(j).getValue());
            }
        }
        return appClone;
    }

    public float [] avgs() {
        float[] avgs = new float[this.getNbStudents() + 1];

        for (int i = 0; i < this.marks.size(); i++) {
            avgs[i] = this.average(i);
        }
        return avgs;
    }
}
