package com.app;

public class Main {

    public static void main(String[] args) {
        Animal kozlenochek = new Animal();
        kozlenochek.name="kozlik";
        kozlenochek.eat();

        Animal duck = new Animal();
        duck.name="DonalDuck";
        duck.eat();


        boolean isSame = duck.equals(kozlenochek);
        System.out.println("isSame="+isSame);
        System.out.println("---------------------");


        Dog sobaka = new Dog();
        sobaka.name="Tuzik";
        sobaka.eat();
        sobaka.age=3;
        sobaka.makeSound();

        System.out.println("---------------------------");
        Cat cat = new Cat();
        cat.name="Bars";
        cat.eat();
        cat.jump();
        System.out.println("--------------------------------");
        Dolphin dolphin = new Dolphin();
        dolphin.name="Misha";
        dolphin.eat();
        dolphin.eat("Ribka");
        System.out.println("--------------------------------");

        Animal dolphinNemo = new Dolphin();
        dolphinNemo.eat();
        dolphinNemo.eat();

        //downcasting
        Animal animal = new Dog();

        /*Dog d1 = new Animal();
        d1.makeSound();*/
        System.out.println("------------------------------------------");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal pet = animalFactory.getAnimal(4);
        pet.eat();


    }





}
