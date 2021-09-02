package com.olegyashcherov.Task_01;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        try {
            System.out.println(calculator.calc(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
