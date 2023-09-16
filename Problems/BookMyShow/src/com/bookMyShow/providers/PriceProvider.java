package com.bookMyShow.providers;

import com.bookMyShow.models.Seat;
import com.bookMyShow.models.Show;

import java.util.List;

public class PriceProvider {

    public int getPrice(Show show, List<Seat> seats){
        return 100;
    }
}
