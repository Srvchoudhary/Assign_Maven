package com.calimpl;

import com.calapi.calculator;

public class Application {
    public static void main(String[] args) {
        int result_add = calculator.add(5,6);
        int result_subtract = calculator.subtract(7,5);
        int result_multiply = calculator.multiply(5,6);
        int result_divide = calculator.divide(6,2);
        System.out.println(result_add);
        System.out.println(result_subtract);
        System.out.println(result_multiply);
        System.out.println(result_divide);
    }
}