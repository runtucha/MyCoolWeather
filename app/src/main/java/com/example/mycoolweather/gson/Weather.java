package com.example.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by glenn_cui on 17-8-2.
 */
public class Weather {
    public String status;
    public AQI aqi;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
