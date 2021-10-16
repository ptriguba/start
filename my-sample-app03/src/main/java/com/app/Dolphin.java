package com.app;

public class Dolphin extends Animal {

    //overload
    public void eat(String dish){
        System.out.println("Dolphin is eating "+dish);
    }

    //override
    public void eat(){
        System.out.println("eat() from Dolphin");
    }

}
