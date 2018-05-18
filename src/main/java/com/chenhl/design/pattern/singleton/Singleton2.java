package com.chenhl.design.pattern.singleton;

/**
 * 第二种：懒汉式，线程安全
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    public synchronized static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println(instance1==instance2);
    }
}
