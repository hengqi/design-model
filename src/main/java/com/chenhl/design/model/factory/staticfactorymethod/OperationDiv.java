package com.chenhl.design.model.factory.staticfactorymethod;

/**
 * 具体产品角色
 */
public class OperationDiv extends Operation{
    @Override
    protected double getResult() {
        if (getValue2() != 0)
            return getValue1() / getValue2();
        throw new IllegalArgumentException("除数不能为0");
    }
}
