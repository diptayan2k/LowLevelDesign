package tictactoe.providers;

import tictactoe.models.PlayingPiece;

public class PlayingPieceProvider {

    public PlayingPiece getPiece(int num){
        for(PlayingPiece piece : PlayingPiece.values()){
            if(piece.getNumber() == num)
                return piece;
        }
        return null;
    }
}
