package com.atm;

import com.atm.models.*;
import com.atm.state.AtmIdleState;

import java.util.HashMap;
import java.util.Map;

public class AtmRoom {


    public static void main(String[] args){

        Map<Denominations, Integer> denominationsIntegerMap = new HashMap<>();
        denominationsIntegerMap.put(Denominations.FIVE_HUNDRED, 10);
        denominationsIntegerMap.put(Denominations.HUNDRED, 10);
        denominationsIntegerMap.put(Denominations.FIFTY, 10);

        Atm atm = new Atm(denominationsIntegerMap, 6500, new AtmIdleState());
        Card card = new Card("123", "1234", Bank.STATE_BANK_OF_INDIA);

        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authenticateUser(atm, card, "1234");
        atm.getAtmState().selectOptiom(atm, AtmOptions.BALANCE_ENQUIRY);
        atm.getAtmState().getBalance(atm, card);
        atm.getAtmState().selectOptiom(atm, AtmOptions.CASH_WITHDRAWL);
        atm.getAtmState().cashWithdrawl(atm, card, 4000);

        System.out.println("----------------------------------");
        atm.getAtmState().selectOptiom(atm ,AtmOptions.CASH_WITHDRAWL);
        atm.getAtmState().cashWithdrawl(atm, card, 2000);
        System.out.println("Atm Balance : " +  atm.getBalance());

        System.out.println("----------------------------------");
        atm.getAtmState().selectOptiom(atm ,AtmOptions.CASH_WITHDRAWL);
        atm.getAtmState().cashWithdrawl(atm, card, 499);
        System.out.println("Atm Balance : " +  atm.getBalance());

        System.out.println("----------------------------------");
        atm.getAtmState().selectOptiom(atm ,AtmOptions.CASH_WITHDRAWL);
        atm.getAtmState().cashWithdrawl(atm, card, 450);
        System.out.println("Atm Balance : " +  atm.getBalance());


    }
}
