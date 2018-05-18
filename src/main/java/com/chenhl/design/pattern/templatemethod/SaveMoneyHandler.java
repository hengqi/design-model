package com.chenhl.design.pattern.templatemethod;

public class SaveMoneyHandler extends AbstractBusinessHandler {

    @Override
    public void handle() {
        System.out.println("save 100");
    }

    @Override
    public boolean isVip() {
        return false;
    }

}
