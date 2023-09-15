package com;

import com.exceptions.ParkingLotException;
import com.models.ParkingLot;
import com.models.Ticket;
import com.cost.CostStrategy;
import com.cost.LuxuryCarCostStrategy;
import com.service.ParkingService;
import com.cost.PassengerCarCostStrategy;

public class ParkingLotMain {

    public static void parkCar(String regNo, String color, ParkingService parkingService, CostStrategy costStrategy){
        try {
            Ticket ticket = parkingService.parkCar(regNo, color, costStrategy);
            System.out.println("Slot " + ticket.getSlot().getId() + " assigned to " + ticket.getVehicle().getRegNo() + ", color " + ticket.getVehicle().getColor() + " with cost : " + ticket.getCost());
        }catch (ParkingLotException e){
            System.out.println(e.getMessage());
        }
    }

    public static void unParkCar(String regNo, ParkingService parkingService){
        try {
            parkingService.unparkCar(regNo);
        }catch (ParkingLotException e){
            System.out.println(e.getMessage());
        }
    }

    public static void getSlotNumber(String regNo, ParkingService parkingService){
        try {
            int slot = parkingService.getSLotNumber(regNo);
            System.out.println("Slot no for reg no: " + regNo + " is: " + slot);
        }catch (ParkingLotException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){

        ParkingLot parkingLot = new ParkingLot(5);
        ParkingService parkingService = new ParkingService(parkingLot);

        parkCar("KA01BB0000","Blue", parkingService, new PassengerCarCostStrategy());
        parkCar("KA01BB0001","Blue", parkingService, new PassengerCarCostStrategy());
        parkCar("KA01BB0002","Red", parkingService, new LuxuryCarCostStrategy());
        parkCar("KA01BB0003","Violet", parkingService, new PassengerCarCostStrategy());
        parkCar("KA01BB0004","White", parkingService, new LuxuryCarCostStrategy());
        parkCar("KA01BB0005","White", parkingService, new PassengerCarCostStrategy());

        parkingService.getRegistrationNumbers("Blue");
        parkingService.getSlotIds("Blue");
        getSlotNumber("KA01BB0001", parkingService);

        unParkCar("KA01BB0001", parkingService);

        parkingService.getRegistrationNumbers("Blue");
        parkingService.getSlotIds("Blue");
        getSlotNumber("KA01BB0001",parkingService);
        unParkCar("KA01BB0001", parkingService);

        parkCar("KA01BB0005","White", parkingService, new PassengerCarCostStrategy());
        getSlotNumber("KA01BB0005", parkingService);








    }


}
