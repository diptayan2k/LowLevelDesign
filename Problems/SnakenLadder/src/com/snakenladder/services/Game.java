package com.snakenladder.services;

import com.snakenladder.models.Dice;
import com.snakenladder.models.Player;
import com.snakenladder.provider.BoardProvider;
import com.snakenladder.provider.DiceProvider;

import java.util.*;

public class Game {

    private DiceProvider diceProvider;
    private BoardProvider boardProvider;
    private int noOfCells;

    public Game(Map<Integer, Integer> snakeAndLadders, int noOfCells) {
        this.diceProvider = new DiceProvider(new Dice(1));
        this.boardProvider = new BoardProvider(noOfCells, snakeAndLadders);
        this.noOfCells = noOfCells;
    }

    public void startGame(){
        System.out.println("Select no. of players :");
        Scanner scanner = new Scanner(System.in);
        int noOfPlayers = scanner.nextInt();
        Deque<Player> playerDeque = initialisePlayers(noOfPlayers);
        Player winner = null;

        while(winner == null){
            turn(playerDeque);
            winner = checkWinner(playerDeque);
        }
        System.out.println("Winner is player : " + winner.getId());
    }

    public Deque<Player> initialisePlayers(int num){

        Deque<Player> playerDeque = new LinkedList<>();
        for(int i = 0; i<num; i+=1){
            playerDeque.addLast(new Player(i+1, 0));
        }
        return playerDeque;
    }

    public void turn(Deque<Player> players){
        Player player = players.removeFirst();
        int num = diceProvider.rollDice();
        System.out.println("Player : " + player.getId() + " Current position : " +(player.getCurrentCell() +1) + " dice number : " + num);

        int nextCell = player.getCurrentCell() + num;
        if(nextCell >= noOfCells){
            nextCell = player.getCurrentCell();

        }
        if(boardProvider.getCell(nextCell).getNextCell()!=null){

            int destCell = boardProvider.getCell(nextCell).getNextCell();
            if(destCell > nextCell){
                System.out.println("Player : " + player.getId() + " ladder at position : "+ (nextCell + 1));
            }
            if(destCell < nextCell){
                System.out.println("Player : " + player.getId() + " snake at position : "+ (nextCell + 1));
            }
            nextCell = destCell;
        }
        System.out.println("Player : " + player.getId() + " updated position : " + (nextCell+1));
        System.out.println("---------------------------------------------------------------");
        player.setCurrentCell(nextCell);
        players.addLast(player);
    }

    public Player checkWinner(Deque<Player> players){
        for(Player player :players){
            if(player.getCurrentCell() == noOfCells - 1)
                return player;
        }
        return null;
    }
}
