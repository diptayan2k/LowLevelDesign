package com.vehicle;

import com.drive.DriveStrategy;

public class HyundaiPassengerVehicleImpl extends Vehicle{

    public HyundaiPassengerVehicleImpl(DriveStrategy driveStrategy){
        super(driveStrategy, "Hyundai passenger");
    }
}
