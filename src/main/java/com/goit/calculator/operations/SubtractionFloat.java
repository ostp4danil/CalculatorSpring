package com.goit.calculator.operations;


import java.math.BigDecimal;

public class SubtractionFloat implements Calculation<Float> {
    @Override
    public String calculate(String equation) {
        int operationSymbolIndex = equation.indexOf("-");
        Float firstNumber = Float.parseFloat(equation.substring(0, operationSymbolIndex));
        Float secondNumber = Float.parseFloat(equation.substring(operationSymbolIndex));
        Float answer = firstNumber - secondNumber;


        return firstNumber + "-" + secondNumber + "=" + answer;
    }
}
