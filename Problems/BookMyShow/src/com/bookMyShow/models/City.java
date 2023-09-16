package com.bookMyShow.models;

import java.util.List;

public class City {
    private String name;
    private String id;
    private List<Threatre> threatres;

    public City(String name, String id, List<Threatre> threatres) {
        this.name = name;
        this.id = id;
        this.threatres = threatres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Threatre> getThreatres() {
        return threatres;
    }

    public void setThreatres(List<Threatre> threatres) {
        this.threatres = threatres;
    }
}
