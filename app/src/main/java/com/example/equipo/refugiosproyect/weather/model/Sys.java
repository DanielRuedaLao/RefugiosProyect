package com.example.equipo.refugiosproyect.weather.model;

public class Sys {

    //ATRIBUTOS
    private double message;
    private String country;
    private int sunrise;
    private int sunset;

    //CONSTRUCTOR
    public Sys() {
    }

    //GETTERS Y SETTERS
    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
}
