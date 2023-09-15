package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.Card;

public class AtmIdleState extends AtmState{

    @Override
    public void insertCard(Atm atm, Card card){
        System.out.println("Card is inserted!!");
        atm.setAtmState(new CardInsertedState());
    }


}
