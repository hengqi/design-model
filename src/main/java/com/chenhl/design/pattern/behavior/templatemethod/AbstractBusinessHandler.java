package com.chenhl.design.pattern.behavior.templatemethod;

import java.util.Random;

public abstract class AbstractBusinessHandler {

    public void getNumber() {
        System.out.println("取号：" + new Random().nextInt());
    }

    public void judge(){
        System.out.println("give a appraise");
    }

    protected abstract void handle();

    protected abstract boolean isVip();

    public final void execute() {
        if (!isVip()) {
            getNumber();
        }
        handle();
        judge();
    }
}
