package com.practice.som.LambdaExpFuncInt;

//  If Lambda Function is used
public class CalculatorImplWithLambdaFunc {

    //  If Lambda Function is used
    public static void main(String[] args) {
        Calculator cal= () -> System.out.println("Switch On");
        cal.switchOn();
    }
}
