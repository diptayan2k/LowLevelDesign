package parking.models;

import parking.cost.CostStrategy;

public class Ticket {

    Slot slot;
    Vehicle vehicle;
    int cost;

    public Ticket(Slot slot, Vehicle vehicle, CostStrategy costStrategy){
        this.vehicle = vehicle;
        this.slot = slot;
        this.cost = costStrategy.calculateCost();
    }

    public Slot getSlot(){
        return slot;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public int getCost(){
        return cost;
    }


}
