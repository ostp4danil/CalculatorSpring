package com.goit.calculator.spring;


import com.goit.calculator.operations.Calculator;

public class CalcExecutor {
    private Calculator calculation;

    public CalcExecutor(Calculator calculation) {
        this.calculation = calculation;
    }

    public String calculate(String equation) {
        return calculation.calculate(equation);
    }


}
