package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.Card;
import com.atm.processors.CashWithdrawlProcessor;
import com.atm.processors.FiftyCashWithdrawlProcessor;
import com.atm.processors.FiveHundredCashWithdrawlProcessor;
import com.atm.processors.HundredCashWithdrawlProcessor;
import com.atm.service.BalanceEnquiryService;

import java.util.Objects;

public class CashWithdrawlState extends AtmState {

    @Override
    public void cashWithdrawl(Atm atm, Card card, int amount){
        BalanceEnquiryService balanceEnquiryService = new BalanceEnquiryService(card);
        Integer balance = balanceEnquiryService.getBalance();

        if(Objects.isNull(balance)){
            exit(atm, "Invalid bank");
        }
        else if(balance < amount){
            exit(atm, "Insufficient Balance");
        }

        CashWithdrawlProcessor cashWithdrawlProcessor = new FiveHundredCashWithdrawlProcessor(new HundredCashWithdrawlProcessor(new FiftyCashWithdrawlProcessor(null)));
        cashWithdrawlProcessor.withdrawCash(atm, amount);
        atm.setAtmState(new OptionSelectionState());
    }
}
