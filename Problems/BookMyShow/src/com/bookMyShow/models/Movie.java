package com.bookMyShow.models;

public class Movie {

    private String id;
    private String name;
    private int durationInSeconds;

    public Movie(String id, String name, int durationInSeconds) {
        this.id = id;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
}
