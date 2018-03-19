package com.chenhl.design.model.templatemethod;

public class TransfeAccountHandler extends AbstractBusinessHandler {

    @Override
    protected void handle() {
        System.out.println("转账1000");
    }

    @Override
    protected boolean isVip() {
        return true;
    }
}