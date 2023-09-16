package com.bookMyShow.services;

import com.bookMyShow.models.*;
import com.bookMyShow.providers.PriceProvider;
import com.bookMyShow.providers.SeatProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService {

    private final SeatProvider seatProvider;
    private final PriceProvider priceProvider;

    public BookingService(SeatProvider seatProvider, PriceProvider priceProvider) {
        this.seatProvider = seatProvider;
        this.priceProvider = priceProvider;
    }

    public synchronized Booking book(Show show, List<Pair<Integer, Integer>> seats, User user) {

        List<Seat> bookedSeats = seatProvider.getBookedSeats(show);

        for (Pair<Integer, Integer> seatNo : seats) {
            if (bookedSeats.stream().anyMatch(seat -> (seat.getRowNo() == seatNo.getKey() && seat.getSeatNo() == seatNo.getValue()))) {
                System.out.println("Seats already booked!!");
                return null;
            }
        }

        List<Seat> bookedSeatList = new ArrayList<>();
        for (Seat seat : show.getScreen().getSeats()) {
            for (Pair<Integer, Integer> seatNo : seats) {
                if (seat.getSeatNo() == seatNo.getValue() && seat.getRowNo() == seatNo.getKey()) {
                    seat.setAvailable(false);
                    bookedSeatList.add(seat);
                }
            }
        }

        return new Booking(UUID.randomUUID().toString(), show, user, bookedSeatList,priceProvider.getPrice(show, bookedSeatList));

    }

    public void unBook(Booking booking){
        Screen screen = booking.getShow().getScreen();
        for(Seat seat : screen.getSeats()){
            for(Seat bookedSeat : booking.getSeats())
            {
                if(seat.equals(bookedSeat)){
                    seat.setAvailable(true);
                }
            }
        }
    }
}
