package com.course.jacoco.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 4));
        System.out.println(calc.subtract(5, 4));
        System.out.println(calc.multiply(5, 4));
        System.out.println(calc.divide(5, 4));
        System.out.println(calc.divide(0.0, 4.0));
        //System.out.println(calc.divide(4, 0));

    }
}
