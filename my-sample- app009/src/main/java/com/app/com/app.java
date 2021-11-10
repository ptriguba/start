package com.app.com;

import javax.print.attribute.standard.Fidelity;
import java.io.File;

public class app {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.setAge(20);
        ivan.setMale(true);
        ivan.setName("Ivan");

        IOProcessor w = new IOProcessor();
        File p = new File("ivan.txt");
        w.sohranyaetvfale(ivan,p);

        System.out.println("----------Read from file------------");

        Person ivanFromFile = w.zagruzhaetizfaila(p);
        System.out.println(ivanFromFile);

    }
}
