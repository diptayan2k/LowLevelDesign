package com.connect.four;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    private Board board;
    private int turn;
    private List<Player> players;
    private int n;

    public Game(Integer n, List<Player> players) {
        this.board = new Board(n);
        this.turn = 0;
        this.players = players;
        this.n = n;
    }

    public void startGame(){

        int numOfPlayers = players.size();
        while(Objects.isNull(checkWinner())){
            turn+=1;
            turn%=numOfPlayers;
            players.get(turn).move(board, n);
        }

        System.out.println("Winner is :" + checkWinner());
    }

    private Player checkWinner(){
        return  null;
    }
}
