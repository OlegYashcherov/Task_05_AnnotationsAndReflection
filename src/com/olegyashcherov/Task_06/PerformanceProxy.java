package com.olegyashcherov.Task_06;

import com.olegyashcherov.Task_01.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PerformanceProxy implements InvocationHandler {

    private final Calculator calculator;

    public PerformanceProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
//        if (method.getName().equals("calc")) {
        if(method.isAnnotationPresent(Metric.class)) {
            try {
                long start = System.nanoTime();
                method.invoke(calculator, args[0]);
                Integer result = (Integer) method.invoke(calculator, args[0]);
                long end = System.nanoTime();
                System.out.println("Время расчета: " + (end - start) + " наносекунд.");
                return result;
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}