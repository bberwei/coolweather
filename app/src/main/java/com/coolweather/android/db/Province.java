package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/13.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setProvinceName(String name){
        provinceName=name;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceCode(int code){
        provinceCode=code;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
}
