package com.chenhl.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 序列化可以破坏单例
 * 解决方式：
 * 在Singleton类中定义readResolve
 */
public class Singleton8 implements Serializable{

    private volatile static Singleton8 instance;

    private Singleton8() {

    }

    public static Singleton8 getInstance() {
        if (null == instance) {
            synchronized (Singleton8.class) {
                if (null == instance) {
                    instance = new Singleton8();
                }
            }
        }

        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.getInstance();
        Singleton8 instance2 = Singleton8.getInstance();

        System.out.println(instance1==instance2);
    }
}
