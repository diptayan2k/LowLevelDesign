package com.connect.four;

public abstract class Player {
    private Type type;

    public Player(Type type) {
        this.type = type;
    }

    public abstract Integer move(Board board, Integer n);

    protected Integer findFreePos(Cell[] column, int n){
        for(int i = n-1; i>=0; i--){
            if(!column[i].isOccupied()){
                return i;
            }
        }
        return -1;
    }


}
