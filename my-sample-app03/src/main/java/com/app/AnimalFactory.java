package com.app;

public class AnimalFactory {


    public Animal getAnimal(int type){
        Animal result = null;
        if(type==0){
            result = new Animal();
        }else if(type==1){
            result = new Dog();
        }else if(type==2){
            result =  new Cat();
        }else if(type==3){
            result = new Dolphin();
        } else if(type==4){
            result = new Monkey();
        }
        return result;
    }


}
