package com.chenhl.design.model.dynamicproxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicSubject(realSubject);

        Class<?> clazz = handler.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), realSubject.getClass().getInterfaces(),
                handler);

        subject.request();

        System.out.println(subject.getClass());
    }
}
