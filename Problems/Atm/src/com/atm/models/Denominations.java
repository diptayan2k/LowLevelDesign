package com.atm.models;

public enum Denominations {

    FIVE_HUNDRED(500),
    HUNDRED(100),
    FIFTY(50);

    final int amount;

    Denominations(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
