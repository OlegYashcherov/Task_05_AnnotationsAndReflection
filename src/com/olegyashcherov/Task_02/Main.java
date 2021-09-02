package com.olegyashcherov.Task_02;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Class<Dog> bClass = Dog.class;
        Dog dog = new Dog();

        List<String> list = getMethods(dog.getClass());
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static <T> List<String> getMethods(Class<T> clazz) {
        List<String> methodsNames = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            methodsNames.add(method.getName());
        }
        Class<? super T> superClass = clazz.getSuperclass();
        if (superClass != null) {
            methodsNames.addAll(getMethods(superClass));
        }
        return methodsNames;
    }
}
