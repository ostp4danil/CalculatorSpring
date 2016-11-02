package com.goit.calculator.spring;


import com.goit.calculator.operations.Calculation;

public class Calculator {
    private Calculation calculation;

    public String calculate(String equation) {
        return calculation.calculate(equation);
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {

        this.calculation = calculation;
    }
}
