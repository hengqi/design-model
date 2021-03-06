package com.chenhl.design.pattern.creational.factory.staticfactorymethod;

public class Client {

    public static void main(String[] args) {

        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);

        System.out.println(operationAdd.getResult());
    }
}
