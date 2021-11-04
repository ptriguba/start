package com.app;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File pashaFile = new File("/Users/alya/Documents/Pasha/pasha.txt");
        boolean exists = pashaFile.exists();
        String name = pashaFile.getName();
        System.out.println("exists="+exists);
        System.out.println("name="+name);

        System.out.println("-------Read from File   InputStream---------------");
        String oldContent = null;
        try {
            InputStream vhod = new FileInputStream(pashaFile);
            int length = vhod.available();
            byte[] fileContent = new byte[length];
            vhod.read(fileContent);
            oldContent = new String(fileContent);
            System.out.println(oldContent);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file!!!!");
        }

        System.out.println("------Write to File   OutpuStream----------------------------------------------");
        try {
            OutputStream vihod = new FileOutputStream(pashaFile);
            //String text = oldContent+"\nHi! Today is a good day!!!";
            String text = "New part \n"+oldContent;

            byte[] fileContent = text.getBytes();
            vihod.write(fileContent);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        //OutputStream vihod = new FileOutputStream();
    }

}
