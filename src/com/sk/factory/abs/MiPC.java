package com.sk.factory.abs;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class MiPC implements PC {
    @Override
    public void make() {
        System.out.println("make xiaomi PC!");
    }
}
