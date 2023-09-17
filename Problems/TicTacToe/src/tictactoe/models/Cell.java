package tictactoe.models;

public class Cell {

    PlayingPiece piece;

    public Cell(PlayingPiece piece) {
        this.piece = piece;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }
}

