package com.chenhl.design.model.factory.abstractfactory;

/**
 * 抽象工厂角色
 */
public interface CarFactory {

    BenzCar getBenzCar();

    TeslaCar getTeslaCar();
}
