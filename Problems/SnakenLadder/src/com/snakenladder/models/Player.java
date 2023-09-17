package com.snakenladder.models;

public class Player {

    private int id;
    private int currentCell;

    public Player(int id, int currentCell) {
        this.id = id;
        this.currentCell = currentCell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(int currentCell) {
        this.currentCell = currentCell;
    }
}
