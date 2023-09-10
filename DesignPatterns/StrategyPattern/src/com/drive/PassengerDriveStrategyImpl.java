package com.drive;

import com.vehicle.Vehicle;

public class PassengerDriveStrategyImpl implements DriveStrategy{
    @Override
    public void drive(Vehicle vehicle) {
        System.out.println(vehicle.getName() + "Passenger drive strategy");
    }
}
