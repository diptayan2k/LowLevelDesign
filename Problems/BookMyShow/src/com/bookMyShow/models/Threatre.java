package com.bookMyShow.models;

import java.util.List;

public class Threatre {

    private String id;
    private String cityId;
    private List<Screen> screens;
    private City city;

    public Threatre(String id, String cityId, List<Screen> screens, City city) {
        this.id = id;
        this.cityId = cityId;
        this.screens = screens;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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
