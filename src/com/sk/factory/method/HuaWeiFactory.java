package com.sk.factory.method;

import java.math.BigDecimal;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone manualPhone() {
        Phone phone = new Phone("华为手机", new BigDecimal(3899));
        return phone;
    }

    @Override
    public void printProductInfo(Phone phone) {
        System.out.println(phone.getBrand() + "工厂手机生产线，出厂价格" + phone.getuPrice());
    }
}
