package com.atm.models;

public class Card {

    private String cardNo;
    private String pin;
    private Bank bank;

    public Card(String cardNo, String pin, Bank bank) {
        this.cardNo = cardNo;
        this.pin = pin;
        this.bank = bank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
