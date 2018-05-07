package com.chenhl.design.model.staticfactorymethod;

/**
 * 工厂类角色
 */
public class OperationFactory {

    public static Operation createOperation(String operationName) {
        Operation operation = null;

        switch (operationName) {
            case "+":
                operation = new OperationAdd();
                break;

            case "-":
                operation = new OperationSub();
                break;

            case "*":
                operation = new OperationMul();
                break;

            case "/":
                operation = new OperationDiv();
                break;

            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return operation;
    }
}
