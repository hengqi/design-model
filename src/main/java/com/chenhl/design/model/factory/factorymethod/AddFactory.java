package com.chenhl.design.model.factory.factorymethod;

/**
 * 具体工厂角色
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
