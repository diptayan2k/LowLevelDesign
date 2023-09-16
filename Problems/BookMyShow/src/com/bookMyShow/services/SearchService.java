package com.bookMyShow.services;

import com.bookMyShow.models.City;
import com.bookMyShow.models.Movie;
import com.bookMyShow.models.Seat;
import com.bookMyShow.models.Show;
import com.bookMyShow.providers.CityMovieProvider;
import com.bookMyShow.providers.ThreatreShowProvider;

import java.util.List;
import java.util.Set;

public class SearchService {

    private final CityMovieProvider cityMovieProvider;
    private final ThreatreShowProvider threatreShowProvider;

    public SearchService(CityMovieProvider cityMovieProvider, ThreatreShowProvider threatreShowProvider) {
        this.cityMovieProvider = cityMovieProvider;
        this.threatreShowProvider = threatreShowProvider;
    }

    public Set<City> getCities(){
        return cityMovieProvider.getCities();
    }

    public List<Movie> getMovieFromCity(City city){
        return cityMovieProvider.getMoviesInCity(city);
    }

    public List<Show> getShows(Movie movie){
       return threatreShowProvider.getShowFromMovie(movie);
    }
}
