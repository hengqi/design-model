package com.chenhl.design.pattern.creational.factory.abstractfactory;

/**
 * 具体产品角色
 */
public class BenzSportCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给我的奔驰跑车加最好的汽油");
    }
}
