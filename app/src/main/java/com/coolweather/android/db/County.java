package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2018/12/13.
 */

public class County extends DataSupport {
    private int id; //县id
    private String countyName;//县名
    private String weatherId;//县对应的天气id
    private int cityId;//县所属城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
