package com.chenhl.design.pattern.structural.adapter;

public class AndroidCharger implements MicroUsbInterface {

    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb型号的充电器充电……");
    }
}
