package com.chenhl.design.pattern.creational.factory.abstractfactory;

/**
 * 具体产品角色
 */
public class TeslaSportCar implements TeslaCar {

    @Override
    public void charge() {
        System.out.println("给我的特斯拉跑车充满电");
    }
}
