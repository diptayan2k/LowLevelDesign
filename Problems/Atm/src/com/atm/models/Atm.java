package com.atm.models;

import com.atm.state.AtmState;

import java.util.Map;

public class Atm {

    private Map<Denominations, Integer> denominationsIntegerMap;
    private int balance;
    private AtmState atmState;

    public Atm(Map<Denominations, Integer> denominationsIntegerMap, int balance, AtmState atmState) {
        this.denominationsIntegerMap = denominationsIntegerMap;
        this.balance = balance;
        this.atmState = atmState;
    }

    public Map<Denominations, Integer> getDenominationsIntegerMap() {
        return denominationsIntegerMap;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

}
