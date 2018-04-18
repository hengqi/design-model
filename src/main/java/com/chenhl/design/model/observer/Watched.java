package com.chenhl.design.model.observer;

/**
 * 抽象主题角色
 */
public interface Watched {

    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyWatchers(String str);
}
