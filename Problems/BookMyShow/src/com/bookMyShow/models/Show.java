package com.bookMyShow.models;

import java.util.Date;

public class Show {
    private Movie movie;
    private Date startTime;
    private Screen screen;
    private Threatre threatre;

    public Show(Movie movie, Date startTime, Screen screen, Threatre threatre) {
        this.movie = movie;
        this.startTime = startTime;
        this.screen = screen;
        this.threatre = threatre;
    }

    public Threatre getThreatre() {
        return threatre;
    }

    public void setThreatre(Threatre threatre) {
        this.threatre = threatre;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
