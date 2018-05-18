package com.chenhl.design.pattern.structural.adapter;

public class Client {

    public static void main(String[] args) {

        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        System.out.println("======");

        Mi5s mi5s = new Mi5s(new AndroidCharger());
        mi5s.charge();

        System.out.println("======");

        Adapter adapter = new Adapter(new AndroidCharger());
        Iphone6Plus newIphone = new Iphone6Plus();
        newIphone.setLightningInterface(adapter);
        newIphone.charge();

    }
}
