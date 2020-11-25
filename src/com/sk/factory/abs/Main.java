package com.sk.factory.abs;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.makePC();
        xiaoMiFactory.makePhone();
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.makePhone();
        appleFactory.makePC();

    }
}
