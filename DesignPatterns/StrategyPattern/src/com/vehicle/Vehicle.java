package com.vehicle;

import com.drive.DriveStrategy;

public abstract class Vehicle {

    DriveStrategy driveStrategy;
    String name;

    public Vehicle(DriveStrategy driveStrategy, String name){
        this.driveStrategy = driveStrategy;
        this.name = name;
    }

    public void drive() {
        driveStrategy.drive(this);
    }

    public String getName(){
        return this.name;
    }
}
