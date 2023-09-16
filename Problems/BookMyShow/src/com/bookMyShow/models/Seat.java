package com.bookMyShow.models;

public class Seat {

    private int rowNo;
    private int seatNo;
    private boolean isAvailable;

    public Seat(int rowNo, int seatNo, boolean isAvailable) {
        this.rowNo = rowNo;
        this.seatNo = seatNo;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
