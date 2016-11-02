package com.goit.calculator.operations;

public class SummationFloat implements Calculator<Float> {

    @Override
    public String calculate(String action) {
        int operationSymbolIndex = action.indexOf("+");
        Float firstNumber = Float.parseFloat(action.substring(0, operationSymbolIndex));
        Float secondNumber = Float.parseFloat(action.substring(operationSymbolIndex));
        Float answer = firstNumber + secondNumber;
        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
