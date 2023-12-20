package com.connect.four;

import java.util.Scanner;

public class Human extends Player{

    private String name;
    public Human(String name) {
        super(Type.HUMAN);
        this.name = name;
    }

    @Override
    public Integer move(Board board, Integer n) {
        int freePos = -1;
        int col = -1;
        while (freePos == -1){
            System.out.println("Enter the row :");
            Scanner scanner = new Scanner(System.in);
            col = scanner.nextInt();

            freePos = findFreePos(board.getCells()[col], n);
            if(freePos == -1){
                System.out.println("Invalid choice!!");
            }
        }
        board.getCells()[col][freePos].setTurn(this);
        return col;
    }
}
