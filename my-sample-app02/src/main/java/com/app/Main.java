package com.app;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.drive();
        System.out.println("bmw.price="+ bmw.price);
        bmw.price=500;
        System.out.println("bmw.price="+bmw.price);


        Car mercedes = new Car();
        System.out.println("mercedes.price="+mercedes.price);
        System.out.println("mercedes.color="+mercedes.color);

        System.out.println("-------------------------");
       // bmw = mercedes;
        System.out.println("bmw.price="+bmw.price);
        mercedes.price=900;
        System.out.println("bmw.price="+bmw.price);
        System.out.println("mercedes.price="+mercedes.price);
        System.out.println("-------------------------");
        bmw.price=1500;
        System.out.println("bmw.price="+bmw.price);
        System.out.println("mercedes.price="+mercedes.price);
        System.out.println("-------------------------");
        boolean x = bmw.equals(mercedes);
        System.out.println("isSame="+x);
        boolean y = (bmw==mercedes);
        System.out.println("== -->"+y);







    }

}
