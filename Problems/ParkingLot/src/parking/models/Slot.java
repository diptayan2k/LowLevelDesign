package parking.models;

public class Slot {
    int id;
    boolean occupied;

    public Slot(int id){
        this.id = id;
        this.occupied = false;
    }

    public void parkCar() {
        this.occupied = true;
    }

    public void unparkCar(){
        this.occupied = false;
    }

    public boolean getStatus(){
        return occupied;
    }

    public int getId(){
        return id;
    }


}
