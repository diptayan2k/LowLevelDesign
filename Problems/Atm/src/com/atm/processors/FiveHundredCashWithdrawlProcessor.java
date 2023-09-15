package com.atm.processors;

import com.atm.models.Denominations;

public class FiveHundredCashWithdrawlProcessor extends  CashWithdrawlProcessor{

    public FiveHundredCashWithdrawlProcessor(CashWithdrawlProcessor nextcashWithdrawlProcessor) {
        super(nextcashWithdrawlProcessor, Denominations.HUNDRED);
    }
}
