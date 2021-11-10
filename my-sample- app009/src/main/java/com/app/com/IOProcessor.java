package com.app.com;

import java.io.*;

public class IOProcessor {


    public void sohranyaetvfale(Person a, File q) {
        try {
            OutputStream t = new FileOutputStream(q);
            DataOutputStream k = new DataOutputStream(t);
            k.writeInt(a.getAge());
            k.writeBoolean(a.isMale());
            k.writeUTF(a.getName());
        } catch (Exception m) {
            m.printStackTrace();
        }

    }

    public Person zagruzhaetizfaila(File q) {
        try {
            InputStream t = new FileInputStream(q);
            DataInputStream x = new DataInputStream(t);
            int ageFromFile = x.readInt();
            boolean maleFromFile = x.readBoolean();
            String nameFromFile = x.readUTF();


            Person ivanFromFile = new Person();
            ivanFromFile.setAge(ageFromFile);
            ivanFromFile.setMale(maleFromFile);
            ivanFromFile.setName(nameFromFile);

            return ivanFromFile;
        }catch (Exception ex){
            throw new RuntimeException(ex);
            //return null;

        }
    }
}
