package com.coolweather.android.db;

import org.litepal.crud.DataSupport;



/**
 * Created by Administrator on 2017/9/13.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setCityName(String name){
        cityName =name;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityCode(int code){
        cityCode =code;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
    public int getProvinceId(){
        return provinceId;
    }
}
