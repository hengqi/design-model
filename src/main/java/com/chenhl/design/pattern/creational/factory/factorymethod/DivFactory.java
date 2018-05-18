package com.chenhl.design.pattern.creational.factory.factorymethod;

/**
 * 具体工厂角色
 */
public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
