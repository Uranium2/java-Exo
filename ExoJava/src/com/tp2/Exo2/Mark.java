package com.tp2.Exo2;

import java.util.Objects;

public class Mark {
    private float value; // désigne la moyenne de la note pour la matière
    private String subject; // désigne le nom de la matière

    public Mark(float value, String subject) {
        if (value>=0 && value<=20)
            this.value = value;
        this. subject = subject;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        if (value>=0 && value<=20)
            this.value = value;
    }
    public String getSubject () {
        return subject;
    }
    public void setSubject (String subject) {
        this. subject = subject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, value);
    }

    @Override
    public boolean equals(Object obj) {
        Mark tmp;
        if (obj instanceof Mark) {
            tmp = (Mark)obj;
        } else
            return false;

        return tmp.getSubject().equals(this.getSubject()) && tmp.getValue() == this.getValue();
    }

    @Override
    public String toString() {
        return subject + ":" + value;
    }
}
