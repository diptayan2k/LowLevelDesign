package parking.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Slot> slots;
    int count;

    public ParkingLot(){
        count = 0;
        slots = new ArrayList<>();
    }

    public ParkingLot(int n){
        count = n;
        slots = new ArrayList<>();
        for(int i = 0; i<n; i++){
            slots.add(new Slot(i+1));
        }
    }

    public void addSlot(Slot slot){
        slots.add(slot);
        count = count + 1;
    }

    public List<Slot> getSlots(){
        return slots;
    }

    public int getNumberOfSlots(){
        return count;
    }

}
