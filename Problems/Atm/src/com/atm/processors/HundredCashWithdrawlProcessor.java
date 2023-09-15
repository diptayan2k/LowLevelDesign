package com.atm.processors;

import com.atm.models.Denominations;

public class HundredCashWithdrawlProcessor extends  CashWithdrawlProcessor{

    public HundredCashWithdrawlProcessor(CashWithdrawlProcessor nextcashWithdrawlProcessor) {
        super(nextcashWithdrawlProcessor, Denominations.FIVE_HUNDRED);
    }
}
