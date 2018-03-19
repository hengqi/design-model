package com.chenhl.design.model.dynamicproxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {

    private Object targetObject;

    public DynamicSubject(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling: " + method);

        method.invoke(targetObject, args);

        System.out.println("after calling: " + method);

        return null;
    }
}
