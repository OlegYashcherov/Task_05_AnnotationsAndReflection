package com.olegyashcherov.Task_02;

public class Dog extends Animal {
    private String name;
    private String breed;

    private void makeBark() {

    }

    @Override
    public void makeSound() {
        makeBark();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
