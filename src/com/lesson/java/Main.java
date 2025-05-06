package com.lesson.java;

import com.lesson.java.abstractAnimal.Aquila;
import com.lesson.java.abstractAnimal.Cane;
import com.lesson.java.abstractAnimal.Passerotto;
import com.lesson.java.abstractAnimal.Pinguino;

import com.lesson.java.interfaceSwim.Nutatore;
import com.lesson.java.interfaceFly.Volante;

public class Main {

    public static void vola(Volante animale){
        animale.vola();
    }

    public static void nuota(Nutatore animale){
        animale.nuota();
    }

    public static void main(String[] args) {

        Pinguino pingu = new Pinguino();
        Aquila usa = new Aquila();
        Cane bobby = new Cane();

        pingu.dormi();
        pingu.mangia();

        usa.dormi();
        usa.mangia();

        bobby.dormi();
        bobby.mangia();


        Volante aquila = new Aquila();
        Volante passerotto = new Passerotto();
        Nutatore pinguino = new Pinguino();
        Nutatore cane = new Cane();
        vola(passerotto);
        vola(aquila);
        nuota(cane);
        nuota(pinguino);

       

    }
}
