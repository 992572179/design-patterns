package com.sk.factory.method;

/**
 * @author wangzy
 * @description 工厂方法
 * @date 2020/10/9
 */
public class Main {
    public static void main(String[] args) {
        PhoneFactory appleFactory = new AppleFactory();
        PhoneFactory huaWeiFactory = new HuaWeiFactory();

        appleFactory.printProductInfo(appleFactory.manualPhone());
        huaWeiFactory.printProductInfo(huaWeiFactory.manualPhone());
    }
}
