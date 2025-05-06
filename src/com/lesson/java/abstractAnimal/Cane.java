package com.lesson.java.abstractAnimal;

public class Cane extends AbstractAnimal {


    @Override
    public void verso() {
        System.out.println("il Cane abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("il Cane e' carnivoro");
    }

}
