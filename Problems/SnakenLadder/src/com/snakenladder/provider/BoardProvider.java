package com.snakenladder.provider;

import com.snakenladder.models.Board;
import com.snakenladder.models.Cell;

import java.util.List;
import java.util.Map;

public class BoardProvider {

    private final Board board;


    public BoardProvider(int noOfCells, Map<Integer, Integer> snakeandldder) {

        Cell[] cells = new Cell[noOfCells];
        initialiseCells(cells, snakeandldder);
        this.board = new Board(cells, snakeandldder);
    }

    public void initialiseCells(Cell[] cells, Map<Integer, Integer> snakeAndLadder){
        for(int i = 0; i< cells.length; i++){
            cells[i] = new Cell();
        }
        for(Map.Entry<Integer, Integer> entry: snakeAndLadder.entrySet()){
            cells[entry.getKey()].setNextCell(entry.getValue());
        }
    }

    public Cell getCell(int cellNo){
        return board.getCells()[cellNo];
    }



}
