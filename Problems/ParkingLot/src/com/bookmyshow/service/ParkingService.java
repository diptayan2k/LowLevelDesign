package com.bookmyshow.service;

import com.exceptions.ParkingLotErrors;
import com.exceptions.ParkingLotException;
import com.bookmyshow.models.ParkingLot;
import com.bookmyshow.models.Slot;
import com.bookmyshow.models.Ticket;
import com.bookmyshow.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    private final ParkingLot parkingLot;
    List<Ticket> tickets;

    public ParkingService(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
        tickets = new ArrayList<>();
    }

    public Ticket parkCar(String regNo, String color, CostStrategy costStrategy){

        Vehicle vehicle = new Vehicle(regNo, color);
        List<Slot> slotList = parkingLot.getSlots();
        for(Slot slot : slotList){
            if(Boolean.FALSE.equals(slot.getStatus())){
                slot.parkCar();
                Ticket ticket = new Ticket(slot, vehicle, costStrategy);
                tickets.add(ticket);
                return ticket;
            }
        }
        throw new ParkingLotException(ParkingLotErrors.SLOTS_NOT_FOUND_ERROR, "No free slots available for " + regNo +  " !!");
    }

    public void unparkCar(String regNo){

        Ticket assignedTicket = null;
        for(Ticket ticket : tickets){
            if(ticket.getVehicle().getRegNo().equals(regNo)){
                assignedTicket = ticket;
                break;
            }
        }
        if(assignedTicket == null){
            throw new ParkingLotException(ParkingLotErrors.VEHICLE_NOT_FOUND, "Vehicle "+ regNo +" is not parked in this parking lot!!");
        }

        System.out.println("Vehicle " + assignedTicket.getVehicle().getRegNo() + " removed from slot " + assignedTicket.getSlot().getId());
        assignedTicket.getSlot().unparkCar();
        tickets.remove(assignedTicket);
    }

    public void getRegistrationNumbers(String color){
        System.out.println("Cars of color " + color);
        for(Ticket ticket : tickets){
            if(ticket.getVehicle().getColor().equals(color)){
                System.out.println(ticket.getVehicle().getRegNo());
            }
        }
    }

    public void getSlotIds(String color){
        System.out.println("Slots with color " + color);
        for(Ticket ticket : tickets){
            if(ticket.getVehicle().getColor().equals(color)){
                System.out.println(ticket.getSlot().getId());
            }
        }
    }

    public int getSLotNumber(String regNo){
        for(Ticket ticket : tickets){
            if(ticket.getVehicle().getRegNo().equals(regNo)){
                return ticket.getSlot().getId();
            }
        }
        throw new ParkingLotException(ParkingLotErrors.VEHICLE_NOT_FOUND, "Vehicle not found for " + regNo + "!!");
    }
}
