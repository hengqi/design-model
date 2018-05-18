package com.chenhl.design.pattern.structural.proxy.demo1;

/**
 * 真实角色
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real subject!");
    }
}
