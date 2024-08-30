package com.ct.sandbox.ctrl.dao.impl;

import com.ct.sandbox.ctrl.dao.Calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divise(int num1, int num2) {
        return (double) num1 / num2;
    }
}
