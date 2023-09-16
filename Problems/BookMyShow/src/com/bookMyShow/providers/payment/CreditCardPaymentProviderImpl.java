package com.bookMyShow.providers.payment;

import com.bookMyShow.models.Booking;
import com.bookMyShow.models.PaymentMethod;

public class CreditCardPaymentProviderImpl implements PaymentProvider{
    @Override
    public boolean pay(Booking booking) {
        System.out.println("Credit card payment successful");
        return true;
    }
}
