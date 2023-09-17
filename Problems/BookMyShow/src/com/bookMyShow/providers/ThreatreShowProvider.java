package com.bookMyShow.providers;

import com.bookMyShow.models.City;
import com.bookMyShow.models.Movie;
import com.bookMyShow.models.Show;
import com.bookMyShow.models.Threatre;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ThreatreShowProvider {

    List<Show> showList;

    public ThreatreShowProvider(List<Show> showList) {
        this.showList = showList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public void addShow(Show show){
        showList.add(show);
    }

    public List<Show> getShowFromMovie(Movie movie, List<Threatre> threatres){
        return showList.stream()
                .filter(show -> threatres.contains(show.getThreatre()))
                .filter(show -> Objects.equals(show.getMovie().getId(), movie.getId()))
                .collect(Collectors.toList());
    }

    public List<Show> getShowInCity(Movie movie, City city){
        return showList.stream()
                .filter(show -> show.getThreatre().getCity().equals(city))
                .filter(show -> Objects.equals(show.getMovie().getId(), movie.getId()))
                .collect(Collectors.toList());
    }
}
