package com.olegyashcherov.Task_01;

public class CalculatorImpl implements Calculator {
    @Override
    public int calc(int number) throws InterruptedException {
        if (number == 0 || number == 1) {
            return 1;
        }
//        Thread.sleep(100);
        return number * calc(number - 1);
    }
}
