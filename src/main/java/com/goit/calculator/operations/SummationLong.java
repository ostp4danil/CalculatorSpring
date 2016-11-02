package com.goit.calculator.operations;

public class SummationLong implements Calculator<Long> {

    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("+");
        Long firstNumber = Long.parseLong(equation.substring(0, operationSymbolIndex));
        Long secondNumber = Long.parseLong(equation.substring(operationSymbolIndex));
        Long answer = firstNumber + secondNumber;

        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
