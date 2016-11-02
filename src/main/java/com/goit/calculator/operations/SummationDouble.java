package com.goit.calculator.operations;

public class SummationDouble implements Calculation<Double> {

    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("+");
        Double firstNumber = Double.parseDouble(equation.substring(0, operationSymbolIndex));
        Double secondNumber = Double.parseDouble(equation.substring(operationSymbolIndex));
        Double answer = firstNumber + secondNumber;

        return firstNumber + "+" + secondNumber + "=" + answer;
    }
}
