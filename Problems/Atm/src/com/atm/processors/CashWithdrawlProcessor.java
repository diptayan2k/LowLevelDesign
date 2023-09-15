package com.atm.processors;

import com.atm.models.Atm;
import com.atm.models.Denominations;

import java.util.Map;
import java.util.Objects;

public abstract class CashWithdrawlProcessor {

    private final Denominations denomination;
    private final CashWithdrawlProcessor nextcashWithdrawlProcessor;

    public CashWithdrawlProcessor(CashWithdrawlProcessor nextcashWithdrawlProcessor, Denominations denomination) {
        this.nextcashWithdrawlProcessor = nextcashWithdrawlProcessor;
        this.denomination = denomination;
    }

    public boolean withdrawCash(Atm atm, int amount){
        Map<Denominations, Integer> denominationsIntegerMap = atm.getDenominationsIntegerMap();
        if(Objects.isNull(denomination)){
            System.out.println("Cash withdrawl not possible!!");
            return false;
        }
        int exixtingNoOfNotes = denominationsIntegerMap.get(denomination);
        int noOfNotes =  Math.min(amount / denomination.getAmount(), exixtingNoOfNotes);
        int remainingAmount = amount - noOfNotes * denomination.getAmount();

        if(Objects.isNull(nextcashWithdrawlProcessor)){
            if(remainingAmount > 0){
                System.out.println("Not possible to get the amount!!");
                return false;
            }
        }
        else {
            boolean isPossible =  nextcashWithdrawlProcessor.withdrawCash(atm, remainingAmount);
            if(!isPossible)
                return false;
        }
        denominationsIntegerMap.put(denomination, exixtingNoOfNotes - noOfNotes);
        atm.setBalance(atm.getBalance() - noOfNotes * denomination.getAmount());

        System.out.println("Withdrawing notes of denomination " + denomination.getAmount() + ": " + noOfNotes);
        return true;

    }
}
