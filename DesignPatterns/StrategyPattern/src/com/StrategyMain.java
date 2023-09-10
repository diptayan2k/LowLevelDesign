package com;

import com.drive.PassengerDriveStrategyImpl;
import com.drive.SportsDriveStrategyImpl;
import com.vehicle.BMWSportsVehicleImpl;
import com.vehicle.HyundaiPassengerVehicleImpl;
import com.vehicle.MarutiPassengerVehicleImpl;

public class StrategyMain {

    public static void main(String[] args){

        SportsDriveStrategyImpl sportsDriveStrategy = new SportsDriveStrategyImpl();
        PassengerDriveStrategyImpl passengerDriveStrategy = new PassengerDriveStrategyImpl();

        BMWSportsVehicleImpl bmwSportsVehicle = new BMWSportsVehicleImpl(sportsDriveStrategy);
        HyundaiPassengerVehicleImpl hyundaiPassengerVehicle = new HyundaiPassengerVehicleImpl(passengerDriveStrategy);
        MarutiPassengerVehicleImpl marutiPassengerVehicle = new MarutiPassengerVehicleImpl(passengerDriveStrategy);

        bmwSportsVehicle.drive();
        hyundaiPassengerVehicle.drive();
        marutiPassengerVehicle.drive();


    }
}
