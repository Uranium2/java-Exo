package com.tp2.Exo2;

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
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass())
            return false;
        Mark tmp = (Mark)obj;
        return tmp.getSubject().equals(this.getSubject()) && tmp.getValue() == this.getValue();
    }
}
