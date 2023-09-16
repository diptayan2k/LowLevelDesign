package com.bookMyShow.providers.payment;

import com.bookMyShow.models.Booking;
import com.bookMyShow.models.PaymentMethod;

import java.awt.print.Book;

public interface PaymentProvider {

    public boolean pay(Booking booking);
}
