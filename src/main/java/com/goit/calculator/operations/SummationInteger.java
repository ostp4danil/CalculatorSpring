package com.goit.calculator.operations;

public class SummationInteger implements Calculator<Integer> {

    @Override
    public String calculate(String action) {
        int operationSymbolIndex = action.indexOf("+");
        Integer firstNumber = Integer.parseInt(action.substring(0, operationSymbolIndex));
        Integer secondNumber = Integer.parseInt(action.substring(operationSymbolIndex));
        Integer answer = firstNumber + secondNumber;
        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
