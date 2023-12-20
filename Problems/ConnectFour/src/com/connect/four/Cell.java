package com.connect.four;

public class Cell {

    private boolean occupied;
    private Player player;

    public Cell() {
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setTurn(Player player) {
        this.player = player;
        this.occupied = true;
    }


}
