package com.app;

public class Main {

    public static void main(String[] args) {
        Person jack = new Person();
        Person bill = new Person("Bill");
        System.out.println("-------------------");
        Car bmw = new Car();
        //bmw.model="BMW";
        //bmw.year=10;

        bmw.setModel("BMW");
        bmw.setYear(10);

        System.out.println(bmw.getModel()+"; "+bmw.getYear());
        System.out.println(bmw);
        System.out.println(bmw.toString());
        System.out.println("-----------------");
        Car audi = new Car(15, "Audi");
        System.out.println(audi);
    }

}
