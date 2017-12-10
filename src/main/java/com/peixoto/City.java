package com.peixoto;

import javax.persistence.Id;

import javax.persistence.Entity;

/**
 * Created by elhassane on 10/12/2017.
 */

@Entity
public class City {
    public City() {
    }
    @Id
    private String cityName ;
    private Long population ;

    public String getCityName() {
        return cityName;
    }

    public City(String cityName, Long population) {
        this.cityName = cityName;
        this.population = population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
