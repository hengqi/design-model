package com.chenhl.design.pattern.behavior.templatemethod;

public class Test {

    public static void main(String[] args) {

        SaveMoneyHandler saveMoneyHandler = new SaveMoneyHandler();
        saveMoneyHandler.execute();

        System.out.println("-----");

        TransfeAccountHandler transfeAccountHandler = new TransfeAccountHandler();
        transfeAccountHandler.execute();

    }
}
