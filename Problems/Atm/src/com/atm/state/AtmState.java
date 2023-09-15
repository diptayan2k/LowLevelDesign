package com.atm.state;


import com.atm.models.Atm;
import com.atm.models.AtmOptions;
import com.atm.models.Card;

public abstract class AtmState {

    public void insertCard(Atm atm, Card card){
        System.out.println("Implementation not found!!");
    }

    public void getBalance(Atm atm, Card card) {
        System.out.println("Implementation not found!!");
    }

    public void authenticateUser(Atm atm, Card card, String pin) {
        System.out.println("Implementation not found!!");
    }

    public void cashWithdrawl(Atm atm, Card card, int amount) {
        System.out.println("Implementation not found!!");
    }

    public void selectOptiom(Atm atm, AtmOptions atmOptions) {
        System.out.println("Implementation not found!!");
    }

    public void exit(Atm atm, String message){

        System.out.println(message);
        System.out.println("Please collect your card!!");
        atm.setAtmState(new AtmIdleState());
    }
}
