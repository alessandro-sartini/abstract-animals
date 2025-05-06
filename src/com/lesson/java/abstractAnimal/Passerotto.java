package com.lesson.java.abstractAnimal;

public class Passerotto extends AbstractAnimal {

    @Override
    public void verso() {
        System.out.println("Passerotto cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("il Passerotto mangia insetti");
    }

}
