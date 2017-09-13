package com.coolweather.android.db;

import org.litepal.crud.DataSupport;



/**
 * Created by Administrator on 2017/9/13.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setCountyName(String name){
        countyName =name;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setWeatherId(int code){
        weatherId =code;
    }
    public int getWeatherId(){
        return weatherId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
    public int getCityId(){
        return cityId;
    }
}
