package com.app;

public class Latte {
   private int Espresso = 1;
    private int milk;
    private String name;

    public Latte(int espresso, int milk, String name) {
        Espresso = espresso;
        this.milk = milk;
        this.name = name;
    }
    public Latte (){}


    public int getEspresso() {
        return Espresso;
    }

    public void setEspresso(int espresso) {
        Espresso = espresso;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString (){
      //  return "name:" + name + " " + Espresso + " portsiy " + milk + " of milk ";
        return String.format("name: %s %s portsiy %s of milk",name,Espresso,milk);
    }

}
