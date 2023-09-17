package tictactoe.models;

public class Grid {

    private Cell[][] cells;
    private int side;

    public Grid(Cell[][] cells, int side) {
        this.cells = cells;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Grid(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
