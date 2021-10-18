package com.main;

import com.app.Car;
import com.app.Sto;

public class Main  extends  CarChild {

    public void m(){
        price=300;
    }

    public static void main(String[] args) {
        Car car = new Car();



        System.out.println("------------private example-------------------");
        //private
        //car.acceleration;
        car.drive();



        System.out.println("---------default example------------------------");
        //default
        //car.model;
        Sto sto = new Sto();
        sto.doTo(car);
        //Sto.doTo(car);

        System.out.println("----------protected example-------");
        sto.doTo2(car);


        CarChild carChild = new CarChild();
        //carChild.price;


        System.out.println("---------public example-------------------------");
        car.title="BMW";
        carChild.title="QQQQ";
        System.out.println("car.title="+car.title);
        System.out.println("carChild.title="+carChild.title);
    }

}
