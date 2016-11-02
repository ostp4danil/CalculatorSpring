package com.goit.calculator.operations;

public class SummationLong implements Calculator<Long> {

    @Override
    public String calculate(String action) {
        int operationSymbolIndex = action.indexOf("+");
        Long firstNumber = Long.parseLong(action.substring(0, operationSymbolIndex));
        Long secondNumber = Long.parseLong(action.substring(operationSymbolIndex));
        Long answer = firstNumber + secondNumber;
        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
