package com.snakenladder.models;

import java.util.List;
import java.util.Map;

public class Board {

    private Cell[] cells;
    private Map<Integer, Integer> snakesAndLadders;

    public Board(Cell[] cells, Map<Integer, Integer> snakesAndLadders) {
        this.cells = cells;
        this.snakesAndLadders = snakesAndLadders;
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

}
