package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.Card;

public class CardInsertedState extends AtmState{

    @Override
    public void authenticateUser(Atm atm, Card card, String pin){
        if(card.getPin().equals(pin)){
            atm.setAtmState(new OptionSelectionState());
            return;
        }
        exit(atm,"Invalid Pin!!");
    }
}
