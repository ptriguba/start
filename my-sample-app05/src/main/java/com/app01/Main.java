package com.app01;

public class Main {

    public static void main(String[] args) {
        Dog jack = new Dog();
        Dog mac = new Dog();

        mac.foodCount=5;
        mac.name="Mac";

        jack.foodCount=10;
        jack.name="Jack";

        Dog.foodCount=500;



        System.out.println("----JACK-");
        System.out.println("name="+jack.name);
        System.out.println("food="+jack.foodCount);


        System.out.println("-------Mac----");
        System.out.println("name="+mac.name);
        System.out.println("food="+mac.foodCount);

        System.out.println("---------------------");
        jack.speak();
        mac.speak();

        Dog.jump();

        jack.jump();
        mac.jump();
    }

}
