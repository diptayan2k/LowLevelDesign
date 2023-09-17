package com.snakenladder.provider;

import com.snakenladder.models.Dice;

import java.util.concurrent.ThreadLocalRandom;

public class DiceProvider {

    private Dice dice;

    public DiceProvider(Dice dice) {
        this.dice = dice;
    }

    public int rollDice(){

        int diceCount = dice.getDiceCount();
        int sum = 0;

        for(int i = 0; i< diceCount; i+=1){
            sum += ThreadLocalRandom.current().nextInt(dice.getMin(), dice.getMax()+1);
        }

        return sum;

    }

}
