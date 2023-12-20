package com.connect.four;

import java.util.Random;
public class AI extends Player {

    public AI() {
        super(Type.AI);
    }

    public Integer generate(Integer n){
        Random random  = new Random();
        return random.nextInt(n);
    }

    @Override
    public Integer move(Board board, Integer n){

        int freePos = -1;
        int col = -1;
        while (freePos == -1){
            col = generate(n);
            freePos = findFreePos(board.getCells()[col], n);
            if(freePos == -1){
                System.out.println("Invalid choice!!");
            }
        }
        board.getCells()[col][freePos].setTurn(this);
        return col;

    }

    private Boolean isOptimal(){
        return false;
    }

}
