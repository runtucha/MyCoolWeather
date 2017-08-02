package com.example.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by glenn_cui on 17-8-2.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
