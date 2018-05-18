package com.chenhl.design.pattern.structural.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before calling: " + method);

        if (null != args) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }

        Object object = method.invoke(proxyObj, args);

        System.out.println("after calling: " + method);

        return object;
    }

    public static Object factory(Object obj) {

        Class<?> clazz = obj.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new VectorProxy(obj));
    }

    public static void main(String[] args) {
        List v = (List) factory(new Vector<>());

        System.out.println(v.getClass());

        v.add("New");
        v.add("York");

        System.out.println(v);

        v.remove(0);
        System.out.println(v);
    }
}
