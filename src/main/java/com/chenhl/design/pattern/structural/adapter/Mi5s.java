package com.chenhl.design.pattern.structural.adapter;

public class Mi5s {

    private MicroUsbInterface microUsbInterface;

    public Mi5s() {
    }

    public Mi5s(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge() {
        System.out.println("开始给我的Mi5s手机充电……");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("结束给我的Mi5s手机充电……");
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
