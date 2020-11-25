package com.sk.factory.method;

import java.math.BigDecimal;

/**
 * @author wangzy
 * @description 手机类实体
 * @date 2020/10/9
 */
public class Phone {
    private String brand;
    private BigDecimal uPrice;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getuPrice() {
        return uPrice;
    }

    public void setuPrice(BigDecimal uPrice) {
        this.uPrice = uPrice;
    }

    public Phone() {
    }

    public Phone(String brand, BigDecimal uPrice) {
        this.brand = brand;
        this.uPrice = uPrice;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", uPrice=" + uPrice +
                '}';
    }
}
