package com.chenhl.design.model.singleton;

/**
 * 第一种：懒汉式，线程不安全
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();

        System.out.println(instance1==instance2);

    }
}
