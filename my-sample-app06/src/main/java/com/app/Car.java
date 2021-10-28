package com.app;

public class Car {
    private int year;
    private String model;

    public Car(int year, String model){
        this.model=model;
        this.year=year;
    }

    public Car(){
    }

    public int getYear(){
        return year;
    }

    public void setModel(String x){
        model=x;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String toString(){
        return "model="+model+"; year="+year;
    }
}
