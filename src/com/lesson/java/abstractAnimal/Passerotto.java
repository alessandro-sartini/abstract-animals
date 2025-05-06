package com.lesson.java.abstractAnimal;

import com.lesson.java.abstractAnimal.interfaceFly.Volante;

public class Passerotto extends AbstractAnimal implements Volante {

    @Override
    public void verso() {
        System.out.println("Passerotto cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("il Passerotto mangia insetti");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!!!");
    }

}
