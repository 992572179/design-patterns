package com.sk.factory.abs;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class ApplePhone implements Phone {
    @Override
    public void make() {
        System.out.println("manual apple phone");
    }
}
