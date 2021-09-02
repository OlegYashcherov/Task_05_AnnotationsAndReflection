package com.olegyashcherov.Task_06;

import com.olegyashcherov.Task_01.Calculator;
import com.olegyashcherov.Task_01.CalculatorImpl;

import java.lang.reflect.Proxy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();
        Calculator calculatorProxy = getCalculatorProxy(calculator, 1);

        String initialMessage = "\nВведите число:\n" +
                "или любой символ для выхода из программы\n";
        System.out.println(initialMessage);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                try {
                    Integer result = calculatorProxy.calc(scanner.nextInt());
                    System.out.println("Результат расчета: " + result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Game over");
                return;
            }
        }
    }

    private static Calculator getCalculatorProxy(Calculator calculator, int number) {
        return (Calculator) Proxy.newProxyInstance(
                calculator.getClass().getClassLoader(),
                calculator.getClass().getInterfaces(),
                new PerformanceProxy(calculator)
        );
    }

}
