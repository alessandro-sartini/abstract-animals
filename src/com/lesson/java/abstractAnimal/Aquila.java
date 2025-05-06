package com.lesson.java.abstractAnimal;

public class Aquila extends AbstractAnimal {

    @Override
    public void verso() {
        System.out.println("Aquila Stride");
    }

    @Override
    public void mangia() {
        System.out.println("il Aquila e' carnivora");
    }

}
