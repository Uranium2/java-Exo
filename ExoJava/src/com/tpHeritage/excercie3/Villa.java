package com.tpHeritage.excercie3;

public class Villa extends Building {
    Integer roomCounter;
    Boolean swimmingPool;

    public Villa(String owner, String address, Double area, Integer roomCounter, Boolean swimmingPool) {
        super(owner, address, area);
        this.roomCounter = roomCounter;
        this.swimmingPool = swimmingPool;
    }

    public Double tax(){
        Double tax = 0.0;
        for (int i = 0; i < roomCounter; i++) {
            tax += 100.0;
        }
        if (swimmingPool)
            tax += 750.0;
        return tax;
    }
}
