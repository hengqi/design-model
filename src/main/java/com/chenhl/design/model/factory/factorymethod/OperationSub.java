package com.chenhl.design.model.factory.factorymethod;

/**
 * 具体产品角色
 */
public class OperationSub extends Operation{
    @Override
    protected double getResult() {
        return getValue1() - getValue2();
    }
}
