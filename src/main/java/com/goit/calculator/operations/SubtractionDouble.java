package com.goit.calculator.operations;


public class SubtractionDouble implements Calculator<Double> {
    @Override
    public String calculate(String action) {
        int operationSymbolIndex = action.indexOf("-");
        Double firstNumber = Double.parseDouble(action.substring(0, operationSymbolIndex));
        Double secondNumber = Double.parseDouble(action.substring(operationSymbolIndex));
        Double answer = firstNumber - secondNumber;
        return firstNumber + "-" + secondNumber + "=" + answer;
    }
}
