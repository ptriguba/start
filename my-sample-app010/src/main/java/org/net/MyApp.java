package org.net;

public class MyApp {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.speak();
        System.out.println("----------------");
        Child child = new Child();
        child.jump();
        child.speak();
        System.out.println("----------------");
        Child2 child2 = new Child2();
        //child2.jump();
        child2.speak();

        System.out.println("---------------");
        Parent myParent = getMyObject();
        System.out.println("--------------------");
        Parent p = new Child();
        Parent p2 = new Child2();

       // Child ch = getMyObject(); // new Child()
        Child ch = (Child) getMyObject();
        Child ch1 = new Child();


    }


    private static Parent getMyObject(){
       // return new Parent();
        return new Child();
        //return new Child2();

        //return new GrandChildA();
    }

}
