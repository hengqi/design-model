package com.chenhl.design.pattern.creational.factory.abstractfactory;

/**
 * 具体产品角色
 */
public class BenzBusinessCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("给我的奔驰商务车加一般的汽油");
    }
}
