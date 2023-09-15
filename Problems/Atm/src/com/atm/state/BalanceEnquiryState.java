package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.Card;
import com.atm.service.BalanceEnquiryService;

import java.util.Objects;

public class BalanceEnquiryState extends AtmState {

    @Override
    public void getBalance(Atm atm, Card card){
        BalanceEnquiryService balanceEnquiryService = new BalanceEnquiryService(card);
        Integer balance = balanceEnquiryService.getBalance();
        if(Objects.isNull(balance))
            exit(atm,"Balance not found");
        printBalance(balance);
        System.out.println("Back to option selection page");
        atm.setAtmState(new OptionSelectionState());
    }

    public void printBalance(Integer balance){
        System.out.println("Balance is :" + balance);
    }
}
