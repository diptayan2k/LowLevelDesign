package com.drive;

import com.vehicle.Vehicle;

public class SportsDriveStrategyImpl implements DriveStrategy{
    @Override
    public void drive(Vehicle vehicle) {
        System.out.println(vehicle.getName() + "Sports drive strategy");
    }
}
