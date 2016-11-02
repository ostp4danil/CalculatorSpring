package com.goit.calculator.operations;

public class SummationFloat implements Calculator<Float> {

    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("+");
        Float firstNumber = Float.parseFloat(equation.substring(0, operationSymbolIndex));
        Float secondNumber = Float.parseFloat(equation.substring(operationSymbolIndex));
        Float answer = firstNumber + secondNumber;

        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
