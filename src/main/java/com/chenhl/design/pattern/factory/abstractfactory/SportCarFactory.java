package com.chenhl.design.pattern.factory.abstractfactory;

/**
 * 具体工厂角色
 */
public class SportCarFactory implements CarFactory {

    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
