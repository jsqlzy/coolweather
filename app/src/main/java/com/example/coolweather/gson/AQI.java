package com.example.coolweather.gson;

/**
 * Created by lenovo on 2017/2/3.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
