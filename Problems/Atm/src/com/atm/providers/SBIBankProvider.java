package com.atm.providers;

import com.atm.models.Account;

import java.util.HashMap;
import java.util.Map;

public class SBIBankProvider implements BankProvider{

    Map<String, Account> cardNoVsAccount;

    public SBIBankProvider(){
        cardNoVsAccount = new HashMap<>();
        cardNoVsAccount.put("123", new Account("dipu", "1332", 5000));
        cardNoVsAccount.put("456", new Account("pidu", "1232", 1000));
    }

    @Override
    public Integer getBalance(String accountNumber) {
        Account account = cardNoVsAccount.get(accountNumber);
        return account.getBalance();
    }
}
