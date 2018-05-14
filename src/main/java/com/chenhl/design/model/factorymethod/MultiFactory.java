package com.chenhl.design.model.factorymethod;

/**
 * 具体工厂角色
 */
public class MultiFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
