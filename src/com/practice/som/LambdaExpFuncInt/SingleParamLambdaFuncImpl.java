package com.practice.som.LambdaExpFuncInt;

interface SingleParamLambdaFunc {
    void number(int input);
}

public class SingleParamLambdaFuncImpl{

    public static void main(String[] args) {

        SingleParamLambdaFunc sp= (int input) -> System.out.println("Number : "+input);
        sp.number(30);
    }
}
