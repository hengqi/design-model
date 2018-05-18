package com.chenhl.design.pattern.factory.abstractfactory;

/**
 * 具体工厂角色
 */
public class BusinessCarFactory implements CarFactory {

    @Override
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaBusinessCar();
    }
}
