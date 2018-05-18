package com.chenhl.design.pattern.observer;

public class Client {

    public static void main(String[] args) {
        //主题
        Watched girl = new ConcreteWatched();

        // 观察者
        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();

        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatchers("开心， 爽");

        System.out.println("-------");

        girl.removeWatcher(watcher2);

        girl.notifyWatchers("不爽");
    }
}
