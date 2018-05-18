package com.chenhl.design.pattern.dynamicproxy.demo3;

public class FooImpl implements Foo {

    @Override
    public void doAction() {
        System.out.println("FooImpl doAction");
    }
}
