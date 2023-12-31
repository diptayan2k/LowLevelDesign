package com.atm.service;

import com.atm.models.Bank;
import com.atm.models.Card;
import com.atm.providers.BankProvider;
import com.atm.providers.SBIBankProvider;

import java.util.Objects;

public class BankingService {

    private final BankProvider bankProvider;
    private final Card card;

    public BankingService(Card card) {
        this.card = card;
        Bank bank = card.getBank();

        switch (card.getBank()){
            case STATE_BANK_OF_INDIA:
                this.bankProvider = SBIBankProvider.getInstance();
                break;
            default:
                this.bankProvider = null;
        }
    }

    public Integer getBalance(){
        if(Objects.isNull(bankProvider)) return null;
        return bankProvider.getBalance(card.getCardNo());
    }

    public void deductBalance(int amount){
        bankProvider.deductBalance(card.getCardNo(), amount);
    }

}
