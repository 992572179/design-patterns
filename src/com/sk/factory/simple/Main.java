package com.sk.factory.simple;

/**
 * @author wangzy
 * @description 简单工厂模式
 * @date 2020/10/9
 */
public class Main {
    public static void main(String[] args) {
        Phone apple = new Apple();
        Phone huawei = new HuaWei();

        apple.make();
        huawei.make();


    }
}
