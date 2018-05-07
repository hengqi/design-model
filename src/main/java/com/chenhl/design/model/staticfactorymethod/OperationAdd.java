package com.chenhl.design.model.staticfactorymethod;

/**
 * 具体产品角色
 */
public class OperationAdd extends Operation{
    @Override
    protected double getResult() {
        return getValue1() + getValue2();
    }
}
