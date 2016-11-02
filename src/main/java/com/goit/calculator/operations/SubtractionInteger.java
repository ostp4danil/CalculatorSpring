package com.goit.calculator.operations;


public class SubtractionInteger implements Calculator<Integer> {
    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("-");
        Integer firstNumber = Integer.parseInt(equation.substring(0, operationSymbolIndex));
        Integer secondNumber = Integer.parseInt(equation.substring(operationSymbolIndex));

        Integer answer = firstNumber - secondNumber;

        return firstNumber + "-" + secondNumber + "=" + answer;
    }
}
