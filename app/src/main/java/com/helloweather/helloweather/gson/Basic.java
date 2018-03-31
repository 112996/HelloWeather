package com.helloweather.helloweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus-pc on 2018/3/30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
