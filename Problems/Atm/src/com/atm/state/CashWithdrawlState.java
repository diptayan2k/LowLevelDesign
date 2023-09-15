package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.Card;
import com.atm.processors.CashWithdrawlProcessor;
import com.atm.processors.FiftyCashWithdrawlProcessor;
import com.atm.processors.FiveHundredCashWithdrawlProcessor;
import com.atm.processors.HundredCashWithdrawlProcessor;
import com.atm.service.BankingService;

import java.util.Objects;

public class CashWithdrawlState extends AtmState {

    @Override
    public void cashWithdrawl(Atm atm, Card card, int amount){
        BankingService bankingService = new BankingService(card);
        Integer balance = bankingService.getBalance();

        if(Objects.isNull(balance)){
            exit(atm, "Invalid bank");
            return;
        }
        else if(balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }


        CashWithdrawlProcessor cashWithdrawlProcessor = new FiveHundredCashWithdrawlProcessor(new HundredCashWithdrawlProcessor(new FiftyCashWithdrawlProcessor(null)));
//        if(cashWithdrawlProcessor.withdrawCash(atm, amount)){
//            System.out.println(balance);
//            balanceEnquiryService.deductBalance(amount);
//        }

        if(cashWithdrawlProcessor.withdrawCash(atm, amount)){
            bankingService.deductBalance(amount);
            System.out.println("remaining balance : " + bankingService.getBalance());
        }

        atm.setAtmState(new OptionSelectionState());
    }
}
