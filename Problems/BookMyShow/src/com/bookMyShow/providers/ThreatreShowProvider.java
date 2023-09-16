package com.bookMyShow.providers;

import com.bookMyShow.models.Movie;
import com.bookMyShow.models.Show;

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

    public List<Show> getShowFromMovie(Movie movie){
        return showList.stream().filter(show -> Objects.equals(show.getMovie().getId(), movie.getId())).collect(Collectors.toList());
    }
}
