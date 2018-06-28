package com.example.jose_victor.app_clima.Weather;

import java.util.List;

public class WeatherResults {
    public List<WeatherForecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<WeatherForecast> results) {
        this.forecast = results;
    }
    String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    List<WeatherForecast> forecast;
}
