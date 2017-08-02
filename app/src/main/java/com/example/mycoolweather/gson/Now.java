package com.example.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by glenn_cui on 17-8-2.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
