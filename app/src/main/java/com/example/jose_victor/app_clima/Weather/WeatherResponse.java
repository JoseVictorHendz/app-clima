package com.example.jose_victor.app_clima.Weather;

public class WeatherResponse {
    public WeatherResults getResults() {

        return results;
    }

    public void setResults(WeatherResults results) {
        this.results = results;
    }

    WeatherResults results;
}
