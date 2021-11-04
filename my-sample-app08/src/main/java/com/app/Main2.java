package com.app;

import java.io.*;

public class Main2 {

    public static void main(String[] args) {
        File pashaFile = new File("/Users/alya/Documents/Pasha/pasha.txt");

        System.out.println("-------Read from File   InputStream---------------");
        String text = readDataFromFile(pashaFile);
        System.out.println(text);



        System.out.println("------Write to File   OutpuStream----------------------------------------------");
        writeDataToFile("Test data", pashaFile);

        //OutputStream vihod = new FileOutputStream();
    }

    private static String readDataFromFile(File file){
        try {
            InputStream vhod = new FileInputStream(file);
            int length = vhod.available();
            byte[] fileContent = new byte[length];
            vhod.read(fileContent);
            return new String(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file!!!!");
            //return "";
            throw new RuntimeException(e);
        }
    }

    private static void writeDataToFile(String text, File file){
        try {
            OutputStream vihod = new FileOutputStream(file);
            byte[] fileContent = text.getBytes();
            vihod.write(fileContent);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
