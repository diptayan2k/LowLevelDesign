package com.connect.four;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Cell[][] cells;
    private Integer n;

    public Board(Integer n) {
        this.cells = new Cell[n][n];
        this.n = n;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Integer getN() {
        return n;
    }
}
