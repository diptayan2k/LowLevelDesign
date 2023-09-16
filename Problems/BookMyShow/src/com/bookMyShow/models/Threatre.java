package com.bookMyShow.models;

import java.util.List;

public class Threatre {

    private String id;
    private List<Screen> screens;

    public Threatre(String id, List<Screen> screens) {
        this.id = id;
        this.screens = screens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
}
