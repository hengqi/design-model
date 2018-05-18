package com.chenhl.design.pattern.singleton;

/**
 * 第五种：静态内部类
 */
public class Singleton5 {

    private static class SingletonHolder {

        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();

        System.out.println(instance1==instance2);
    }
}
