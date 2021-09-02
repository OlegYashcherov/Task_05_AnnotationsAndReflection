package com.olegyashcherov.Task_07;

import com.olegyashcherov.Task_02.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog2.setName("");
        dog2.setBreed("");
        BeanUtils.assign(dog1, dog2);
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
    }
}
