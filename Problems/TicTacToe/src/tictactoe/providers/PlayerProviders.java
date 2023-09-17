package tictactoe.providers;

import tictactoe.models.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerProviders {
    private final List<Player> players;

    public PlayerProviders() {
        players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void initialisePlayers(int noOfPlayers){
        for(int i = 0; i< noOfPlayers; i++){
            Player player = new Player(i+1, new PlayingPieceProvider().getPiece(i));
            System.out.printf("Playing piece %s assigned to player : %d%n", player.getAssignedPiece().toString(),player.getId());
            this.players.add(player);
        }
    }
}
