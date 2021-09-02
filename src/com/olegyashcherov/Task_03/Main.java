package com.olegyashcherov.Task_03;

import com.olegyashcherov.Task_02.Dog;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        for (Method method : Dog.class.getDeclaredMethods()) {
            String methodName = method.getName();
            if (methodName.startsWith("get")) {
                System.out.println(methodName);
            }
        }

    }
}
