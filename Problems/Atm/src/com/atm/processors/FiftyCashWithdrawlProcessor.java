package com.atm.processors;

import com.atm.models.Denominations;

public class FiftyCashWithdrawlProcessor extends  CashWithdrawlProcessor{

    public FiftyCashWithdrawlProcessor(CashWithdrawlProcessor nextcashWithdrawlProcessor) {
        super(nextcashWithdrawlProcessor, Denominations.FIFTY);
    }
}
