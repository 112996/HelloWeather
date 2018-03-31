package com.helloweather.helloweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus-pc on 2018/3/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
