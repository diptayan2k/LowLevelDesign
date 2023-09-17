package tictactoe.models;

public class Player {
    int id;
    PlayingPiece assignedPiece;

    public Player(int id, PlayingPiece assignedPiece) {
        this.id = id;
        this.assignedPiece = assignedPiece;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayingPiece getAssignedPiece() {
        return assignedPiece;
    }

    public void setAssignedPiece(PlayingPiece assignedPiece) {
        this.assignedPiece = assignedPiece;
    }
}
