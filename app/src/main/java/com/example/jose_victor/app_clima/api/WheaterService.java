package com.example.jose_victor.app_clima.api;

import com.example.jose_victor.weather__.Weather.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WheaterService {
    @GET("weather")
    Call<WeatherResponse> listWeather(@Query("format") String format,
                                      @Query("city_name") String cidade,
                                      @Query("key") String key);
}
