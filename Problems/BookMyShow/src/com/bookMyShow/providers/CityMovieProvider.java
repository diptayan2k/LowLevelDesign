package com.bookMyShow.providers;

import com.bookMyShow.models.City;
import com.bookMyShow.models.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityMovieProvider {

    private Map<City, List<Movie> > cityMovieMap;

    public CityMovieProvider(Map<City, List<Movie>> cityMovieMap) {
        this.cityMovieMap = cityMovieMap;
    }

    public Map<City, List<Movie>> getCityMovieMap() {
        return cityMovieMap;
    }

    public void setCityMovieMap(Map<City, List<Movie>> cityMovieMap) {
        this.cityMovieMap = cityMovieMap;
    }

    public void addMovieInCity(City city, Movie movie){
        List<Movie> movies = cityMovieMap.getOrDefault(city, new ArrayList<>());
        if(!movies.contains(movie)){
            movies.add(movie);
        }
        else{
            movies = new ArrayList<>();
            movies.add(movie);
        }
        cityMovieMap.put(city, movies);
    }

    public List<Movie> getMoviesInCity(City city){
        return cityMovieMap.getOrDefault(city, new ArrayList<>());
    }

    public Set<City> getCities(){
        return cityMovieMap.keySet();
    }


}
