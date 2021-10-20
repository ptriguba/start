package com.app;

public class Child extends Parent {


    public void speak(String message){
        System.out.println(message);
    }

    public final void speak(){
        System.out.println("Thsi is child speak()");
    }


}
