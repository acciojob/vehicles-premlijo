package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }

}
