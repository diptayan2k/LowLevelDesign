package com.atm.providers;

import com.atm.models.Account;
import com.atm.models.Card;

public interface BankProvider {

    Integer getBalance(String cardNo);

    void deductBalance(String cardNo, int amount);
}
