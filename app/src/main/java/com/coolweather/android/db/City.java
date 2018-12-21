package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2018/12/13.
 */

public class City extends DataSupport {
    private int id;//市id
    private String cityName;//市名
    private int cityCode;//市代号
    private int provinceId;//市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
