package com.app;

import java.io.*;

public class IOProcessor {

    public void writerToFile(Person jack, File file){
        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(jack);
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public Person readFromFile(File file){
        try{
            InputStream in = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(in);
            Object res = objectInputStream.readObject();
            Person personResult = (Person) res;
            return personResult;
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
