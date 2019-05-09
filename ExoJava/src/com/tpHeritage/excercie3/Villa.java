package com.tpHeritage.excercie3;

public class Villa extends Building {
    public Integer getRoomCounter() {
        return roomCounter;
    }

    public void setRoomCounter(Integer roomCounter) {
        this.roomCounter = roomCounter;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    Integer roomCounter;
    Boolean swimmingPool;

    public Villa(String owner, String address, Double area, Integer roomCounter, Boolean swimmingPool) {
        super(owner, address, area);
        this.roomCounter = roomCounter;
        this.swimmingPool = swimmingPool;
    }

    @Override
    public Double tax(){
        Double tax = 0.0;
        for (int i = 0; i < roomCounter; i++) {
            tax += 100.0;
        }
        if (swimmingPool)
            tax += 750.0;
        return tax;
    }

    @Override
    public void print() {
        System.out.println("Address: " + getAddress() +
                " Owner: " + getOwner() +
                " Area of building: " + getArea() +
                " Number of rooms: " + getRoomCounter() +
                " Has swimming pool: " + getSwimmingPool());
    }
}
