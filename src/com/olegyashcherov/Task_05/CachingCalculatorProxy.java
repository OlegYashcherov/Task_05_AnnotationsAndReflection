package com.olegyashcherov.Task_05;

import com.olegyashcherov.Task_01.Calculator;
import com.olegyashcherov.Task_01.CalculatorImpl;

public class CachingCalculatorProxy implements Calculator {

    private final CalculatorImpl calculator;
    private final LRUCache<Integer, Integer> lruCache;

    public CachingCalculatorProxy() {
        this.calculator = new CalculatorImpl();
        this.lruCache = new LRUCache<>(16);
    }

    @Override
    public int calc(int number) throws InterruptedException {
        Integer value = (Integer) lruCache.find(number);
        if (value == null) {
            value = calculator.calc(number);
            lruCache.set(number, value);
        }
        return value;
    }
}