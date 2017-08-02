package com.example.mycoolweather.gson;

/**
 * Created by glenn_cui on 17-8-2.
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
