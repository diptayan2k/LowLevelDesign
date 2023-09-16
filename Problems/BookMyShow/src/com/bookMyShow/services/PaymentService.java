package com.bookMyShow.services;

import com.bookMyShow.models.Booking;
import com.bookMyShow.models.PaymentMethod;
import com.bookMyShow.providers.payment.CreditCardPaymentProviderImpl;
import com.bookMyShow.providers.payment.DebitCardPaymentProviderImpl;
import com.bookMyShow.providers.payment.PaymentProvider;

public class PaymentService {

    private final PaymentProvider paymentProvider;

    public PaymentService(PaymentMethod paymentMethod) {
        switch (paymentMethod){
            case DEBIT_CARD:
                paymentProvider = new CreditCardPaymentProviderImpl();
                break;
            case CREDIT_CARD:
                paymentProvider = new DebitCardPaymentProviderImpl();
                break;
            default:
                paymentProvider = null;
        }
    }

    public boolean pay(Booking booking){
        if(paymentProvider == null){
            System.out.println("Invalid payment method!!");
        }
        return paymentProvider.pay(booking);
    }
}
