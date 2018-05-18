package com.chenhl.design.pattern.singleton;

/**
 * 双重校验锁
 */
public class Singleton7 {

    private volatile static Singleton7 instance;

    private Singleton7() {

    }

    public static Singleton7 getInstance() {
        if (null == instance) {
            synchronized (Singleton7.class) {
                if (null == instance) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();

        System.out.println(instance1==instance2);
    }
}
