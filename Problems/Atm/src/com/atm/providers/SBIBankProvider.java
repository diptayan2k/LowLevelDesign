package com.atm.providers;

import com.atm.models.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SBIBankProvider implements BankProvider{

    private final Map<String, Account> cardNoVsAccount;
    private static SBIBankProvider sbiBankProvider;

    private SBIBankProvider(){
        cardNoVsAccount = new HashMap<>();
        cardNoVsAccount.put("123", new Account("dipu", "1332", 5000));
        cardNoVsAccount.put("456", new Account("pidu", "1232", 1000));
    }

    synchronized public static SBIBankProvider getInstance(){
        if(Objects.isNull(sbiBankProvider)){
            sbiBankProvider =  new SBIBankProvider();
            return sbiBankProvider;
        }
        return sbiBankProvider;
    }

    @Override
    public Integer getBalance(String cardNo) {
        Account account = cardNoVsAccount.get(cardNo);
        return account.getBalance();
    }

    @Override
    public void deductBalance(String cardNo, int amount) {
        Account account = cardNoVsAccount.get(cardNo);
        account.setBalance(account.getBalance() - amount);
        cardNoVsAccount.put(cardNo, account);
    }
}
