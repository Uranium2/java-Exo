package com.tp2.exo1;

import java.util.ArrayList;
import java.util.Random;

public class De {
    private Integer lower_range;
    private Integer upper_range;
    ArrayList<Integer> history;

    public De(Integer lower_range, Integer upper_range) {
        this.lower_range = lower_range;
        this.upper_range = upper_range;
        this.history = new ArrayList<>();
        this.throwMe();
    }

    public Integer throwMe() {
        Random rnd = new Random();
        Integer res = rnd.nextInt(upper_range - lower_range) + lower_range;
        this.history.add(res);
        return  res;
    }

    public Integer getvalue() {
        return history.get(history.size() - 1);
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }

    public void print() {
        System.out.println("Throw historic:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }

    public void throwNb(Integer nb) {
        for (int i = 0; i < nb; i++) {
            this.throwMe();
            this.print();
        }
    }
}
