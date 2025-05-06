package com.lesson.java.abstractAnimal;

import com.lesson.java.interfaceSwim.Nutatore;

public class Cane extends AbstractAnimal implements Nutatore{


    @Override
    public void verso() {
        System.out.println("il Cane abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("il Cane e' carnivoro");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando!!!");
    }

}
