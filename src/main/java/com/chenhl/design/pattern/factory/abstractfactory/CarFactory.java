package com.chenhl.design.pattern.factory.abstractfactory;

/**
 * 抽象工厂角色
 */
public interface CarFactory {

    BenzCar getBenzCar();

    TeslaCar getTeslaCar();
}
