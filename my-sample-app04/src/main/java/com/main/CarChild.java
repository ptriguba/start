package com.main;


import com.app.Car;

public class CarChild extends Car {

    public void showPrice(){
        price = 500;
        System.out.println("Price= "+price);
    }
}
