package com.app01;

public class Dog {
    public String name;
    public static int foodCount;


    public void speak(){
        System.out.println("Dog speak; "+name+"; "+foodCount);
    }

    public static void jump(){
        //System.out.println("Jump-static; "+foodCount+"; "+name);
        System.out.println("Jump-static; "+foodCount);
    }


}
