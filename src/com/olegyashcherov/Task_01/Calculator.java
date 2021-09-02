package com.olegyashcherov.Task_01;

import com.olegyashcherov.Task_06.Metric;

public interface Calculator {
    /**
     * Расчет факториала числа.
     * @param number
     */
    @Metric
    int calc (int number) throws InterruptedException;
}
