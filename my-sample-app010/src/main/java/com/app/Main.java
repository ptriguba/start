package com.app;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.setAge(10);
        ivan.setName("Vania");
        ivan.setMale(true);

        File file = new File("ivan.txt");

        IOProcessor ioProcessor = new IOProcessor();
        ioProcessor.writerToFile(ivan, file);

        Person personFromFile = ioProcessor.readFromFile(file);
        System.out.println(personFromFile);
    }

}
