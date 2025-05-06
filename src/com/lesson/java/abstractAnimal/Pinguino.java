package com.lesson.java.abstractAnimal;

import com.lesson.java.abstractAnimal.interfaceSwim.Nutatore;

public class Pinguino extends AbstractAnimal implements Nutatore{

    @Override
    public void verso() {
        System.out.println("il pinguino mangia pesce");
    }

    @Override
    public void mangia() {
        System.out.println("il pinguino mangia raglie");
    }
    @Override
    public void nuota() {
        System.out.println("sto nuotando!!!");
    }

 

  
}
