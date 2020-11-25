package com.sk.factory.simple;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class Apple implements Phone {
    @Override
    public void make() {
        System.out.println("Apple Phone...");
    }
}
