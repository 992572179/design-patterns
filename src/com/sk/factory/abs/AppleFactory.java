package com.sk.factory.abs;

/**
 * @author wangzy
 * @description
 * @date 2020/10/9
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

    @Override
    public PC makePC() {
        return new MacPC();
    }
}
