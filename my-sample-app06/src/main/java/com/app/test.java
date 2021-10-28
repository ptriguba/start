package com.app;

public class test {
    public static void main(String[] args) {
        Latte midle = new Latte();
        midle.setEspresso(1);
        midle.setName("Midle");
        midle.setMilk(200);
        System.out.println("name: " + midle.getName() + " " +midle.getEspresso() +" portsiy "+midle.getMilk() +" ml of milk");
        System.out.println("-------------------");
        Latte small = new Latte();
        small.setName("small");
        small.setMilk(100);
        System.out.println("name: " + small.getName() + " " + small.getEspresso() +" portsiy "+small.getMilk() +" ml of milk");
        System.out.println("-------------------");
        Latte big = new Latte();
        big.setMilk(300);
        big.setEspresso(2);
        big.setName("Big");
        System.out.println("name: " + big.getName()+ " " + big.getEspresso() +" portsiy "+big.getMilk() +" ml of milk");
        System.out.println("-------------------");
        Latte flatwhite = new Latte (2,200,"flatwhite");
        System.out.println("name: " + flatwhite.getName()+ " " + flatwhite.getEspresso() +" portsiy "+flatwhite.getMilk() +" ml of milk");
        System.out.println("-------------------");
        System.out.println(flatwhite);
        System.out.println(big);
        Latte capuchino = new Latte (1,500,"capuchino");
        System.out.println(capuchino);


    }

}
