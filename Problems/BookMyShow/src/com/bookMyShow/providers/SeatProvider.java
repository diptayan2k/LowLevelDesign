package com.bookMyShow.providers;

import com.bookMyShow.models.Screen;
import com.bookMyShow.models.Seat;
import com.bookMyShow.models.Show;

import java.util.List;
import java.util.stream.Collectors;

public class SeatProvider {

    public List<Seat> getAvailableSeats(Show show){
        Screen screen = show.getScreen();
        return screen.getSeats().stream().filter(Seat::isAvailable).collect(Collectors.toList());
    }

    public List<Seat> getBookedSeats(Show show){
        Screen screen = show.getScreen();
        return screen.getSeats().stream().filter(seat -> !seat.isAvailable()).collect(Collectors.toList());
    }
}
