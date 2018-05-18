package com.chenhl.design.pattern.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operationAdd = factory.createOperation();

        operationAdd.setValue1(10);
        operationAdd.setValue2(5);

        System.out.println(operationAdd.getResult());
    }
}
