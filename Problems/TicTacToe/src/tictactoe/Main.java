package tictactoe;

import tictactoe.providers.GridProvider;
import tictactoe.providers.PlayerProviders;
import tictactoe.services.Game;

public class Main {

    public static void main(String[] args){
        GridProvider gridProvider = new GridProvider(3);
        PlayerProviders playerProviders = new PlayerProviders();
        playerProviders.initialisePlayers(2);

        Game game = new Game(gridProvider, playerProviders);
        game.startGame();
    }
}
