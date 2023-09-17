package com.snakenladder;

import com.snakenladder.services.Game;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<Integer, Integer> snakeAndLadderMap2 = new HashMap<>();
        snakeAndLadderMap2.put(2, 37);
        snakeAndLadderMap2.put(7, 14);
        snakeAndLadderMap2.put(15, 27);
        snakeAndLadderMap2.put(21, 6);
        snakeAndLadderMap2.put(29, 52);
        snakeAndLadderMap2.put(38, 85);
        snakeAndLadderMap2.put(42, 20);
        snakeAndLadderMap2.put(50, 24);
        snakeAndLadderMap2.put(55, 10);
        snakeAndLadderMap2.put(61, 82);
        snakeAndLadderMap2.put(72, 18);
        snakeAndLadderMap2.put(75, 64);
        snakeAndLadderMap2.put(79, 99);
        snakeAndLadderMap2.put(88, 40);
        snakeAndLadderMap2.put(91, 67);
        snakeAndLadderMap2.put(97, 87);

        Game game = new Game(snakeAndLadderMap2, 100);
        game.startGame();
    }
}
