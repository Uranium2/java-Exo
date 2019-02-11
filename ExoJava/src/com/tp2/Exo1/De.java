package com.tp2.Exo1;

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
    }

    public Integer throwMe() {
        Random rnd = new Random();
        Integer res = rnd.nextInt(upper_range - lower_range) + lower_range;
        this.history.add(res);
        return  res;
    }
}
