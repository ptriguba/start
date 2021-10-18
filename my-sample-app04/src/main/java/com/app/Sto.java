package com.app;

public class Sto {

    public void doTo(Car car){
        car.model="G30";
        System.out.println("STO. model is "+car.model);
    }

    public void doTo2(Car car){
        car.model="G30";
        car.price=100;
        System.out.println("STO2. model is "+car.model+"; price is "+car.price);
    }

}
