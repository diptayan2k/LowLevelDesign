package com.bookMyShow.providers.payment;

import com.bookMyShow.models.Booking;

public class DebitCardPaymentProviderImpl implements PaymentProvider{
    @Override
    public boolean pay(Booking booking) {
        System.out.println("Debit card payment failed");
        return false;
    }
}
