package com.atm.state;

import com.atm.models.Atm;
import com.atm.models.AtmOptions;

public class OptionSelectionState extends AtmState {

    @Override
    public void selectOptiom(Atm atm, AtmOptions atmOptions){

        switch (atmOptions){
            case CASH_WITHDRAWL:
                atm.setAtmState(new CashWithdrawlState());
                break;
            case BALANCE_ENQUIRY:
                atm.setAtmState(new BalanceEnquiryState());
                break;
            default:
                exit(atm,"Invalid selection");
        }


    }
}
