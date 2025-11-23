package com.practice.som.LambdaExpFuncInt;


public class CalculatorImplWithoutLambdaFunc implements Calculator{

    // If Lambda Function is not used
    @Override
    public void switchOn() {
        System.out.println("Switch On");
    }


    // If Lambda Function is not used
    public static void main(String[] args) {
        CalculatorImplWithoutLambdaFunc cal = new CalculatorImplWithoutLambdaFunc();
        cal.switchOn();

    }
}
