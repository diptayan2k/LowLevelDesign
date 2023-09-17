package com.snakenladder.models;

public class Cell {

    private Integer nextCell;

    public Cell() {
        this.nextCell = null;
    }

    public Cell(int nextCell) {
        this.nextCell = nextCell;
    }

    public Integer getNextCell() {
        return nextCell;
    }

    public void setNextCell(Integer nextCell) {
        this.nextCell = nextCell;
    }
}
