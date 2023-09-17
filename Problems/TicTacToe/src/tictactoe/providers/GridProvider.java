package tictactoe.providers;

import tictactoe.models.Cell;
import tictactoe.models.Grid;
import tictactoe.models.PlayingPiece;

public class GridProvider {

    private Grid grid;

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridProvider(int side){
        Cell[][] cells = new Cell[side][side];
        initialiseCells(cells, side);
        this.grid = new Grid(cells, side);
    }

    public void initialiseCells(Cell[][] cells, int side){
        for(int i = 0; i<side; i++) {
            for(int j = 0; j<side; j++){
                cells[i][j] = new Cell(null);
            }
        }
    }

    public boolean assignPlayingPiece(int row, int col, PlayingPiece piece){
        if(grid.getCells()[row][col].getPiece()== null){
            grid.getCells()[row][col].setPiece(piece);
            return true;
        }
        System.out.println("Cell already occupied!!");
        return false;
    }

}
