package com.chenhl.design.pattern.behavior.observer;

/**
 * 具体的观察者
 */
public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String string) {
        System.out.println(string);
    }
}
