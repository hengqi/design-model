package com.chenhl.design.pattern.singleton;

/**
 * 第四种：饿汉,变种
 */
public class Singleton4 {

    private static Singleton4 instance;

    static {
        instance = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();

        System.out.println(instance1==instance2);
    }
}
