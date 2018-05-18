package com.chenhl.design.pattern.structural.adapter;

public class Adapter implements LightningInterface {

    private MicroUsbInterface microUsbInterface;

    public Adapter() {
    }

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
