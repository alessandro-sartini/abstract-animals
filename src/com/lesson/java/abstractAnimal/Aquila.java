package com.lesson.java.abstractAnimal;

import com.lesson.java.interfaceFly.Volante;

public class Aquila extends AbstractAnimal implements Volante {

    @Override
    public void verso() {
        System.out.println("Aquila Stride");
    }

    @Override
    public void mangia() {
        System.out.println("il Aquila e' carnivora");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!!!");
    }

}
