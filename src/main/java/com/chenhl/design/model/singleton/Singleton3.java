package com.chenhl.design.model.singleton;

/**
 * 第三种：饿汉
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();

        System.out.println(instance1==instance2);
    }
}
