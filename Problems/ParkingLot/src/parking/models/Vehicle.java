package parking.models;

public class Vehicle {

    String regNo;
    String color;

    public Vehicle(String regNo, String color){
        this.regNo = regNo;
        this.color = color;
    }

    public String getRegNo(){
        return regNo;
    }

    public String getColor(){
        return color;
    }

}
