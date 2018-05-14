package com.chenhl.design.model.factory.abstractfactory;

public class Client {

    public static void main(String[] args) {
        SportCarFactory sportCarFactory = new SportCarFactory();
        TeslaCar teslaCar = sportCarFactory.getTeslaCar();
        teslaCar.charge();
    }
}
