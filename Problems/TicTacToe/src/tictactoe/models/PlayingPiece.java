package tictactoe.models;

import java.util.Arrays;

public enum PlayingPiece {
    X(0),
    O(1);

    private final int number;

    PlayingPiece(int i) {
        this.number = i;
    }

    public int getNumber() {
        return number;
    }

}
