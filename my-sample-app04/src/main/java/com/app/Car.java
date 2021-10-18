package com.app;

public class Car {
    public String title;

    private int acceleration;
    String model = "M1";
    protected int price;


    public void drive(){
        Data data = new Data();
        System.out.println("My acceleration is "+acceleration);
    }

}
