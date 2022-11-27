package com.cyk.kuouweather.db;

import org.litepal.crud.LitePalSupport;

/***
 * This is an information table about the storage of China's Provinces.
 *
 **@author Can
 *@version 1.0
 *@since JDK1.8
 */

public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
