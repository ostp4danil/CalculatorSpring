package com.goit.calculator.operations;


import java.math.BigDecimal;

public class SubtractionInteger implements Calculation<Integer> {
    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("-");
        Integer firstNumber = Integer.parseInt(equation.substring(0, operationSymbolIndex));
        Integer secondNumber = Integer.parseInt(equation.substring(operationSymbolIndex));

        Integer answer = firstNumber - secondNumber;

        return firstNumber + "-" + secondNumber + "=" + answer;
    }
}
