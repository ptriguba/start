package com.app;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        //parent.lastName = "Triguba";
        parent.speak();
        System.out.println("--------------");
        Child child = new Child();
        child.speak("Another lastname");
        child.speak();
        System.out.println("-----------------");
        SubChild subChild = new SubChild();
        subChild.speak();
    }

}
