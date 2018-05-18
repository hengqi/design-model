package com.chenhl.design.pattern.structural.adapter;

public class AppleCharger implements LightningInterface {

    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning型号的充电器充电");
    }
}
