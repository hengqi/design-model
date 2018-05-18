package com.chenhl.design.pattern.creational.factory.abstractfactory;

/**
 * 具体产品角色
 */
public class TeslaBusinessCar implements TeslaCar {

    @Override
    public void charge() {
        System.out.println("不用给我的特斯拉商务车充满电");
    }
}
