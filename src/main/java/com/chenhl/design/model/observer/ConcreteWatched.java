package com.chenhl.design.model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色
 */
public class ConcreteWatched implements Watched {

    private List<Watcher> list = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {
        list.forEach(watcher -> watcher.update(str));
    }
}
