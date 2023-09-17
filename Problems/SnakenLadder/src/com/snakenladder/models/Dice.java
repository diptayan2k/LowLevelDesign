package com.snakenladder.models;

public class Dice {

    private int diceCount;
    private int max;
    private int min;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
        this.max = 6;
        this.min = 1;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
