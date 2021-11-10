
import java.io.*;

public class Hometest {

    public static void main(String[] args) {
        File igraemsy = new File("/Users/alya/Documents/удалить после511/test2.txt/test2.txt");
        boolean realnoliest = igraemsy.exists();
        String egoimya = igraemsy.getName();
        System.out.println(realnoliest);
        System.out.println(egoimya);
        System.out.println("--------------------------");
        String tochtobilovfaile = null;
        try {
            InputStream izfailavproramu = new FileInputStream(igraemsy);
            int pokazhetvestekts = izfailavproramu.available();
            byte [] nameperemenoy = new byte[pokazhetvestekts];
            izfailavproramu.read(nameperemenoy);
            tochtobilovfaile = new String(nameperemenoy);
            System.out.println(tochtobilovfaile);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Шеф все пропало");
        }
        System.out.println("-------------------------------------");
        try {
            OutputStream vnosimperemenyvfile = new FileOutputStream(igraemsy);
            String kakoytotekst = "\n eto novy tekst spervoy stroki" + tochtobilovfaile;

            byte [] nameperemenoy = kakoytotekst.getBytes();
            vnosimperemenyvfile.write(nameperemenoy);
        }
        catch (Exception q){
            q.printStackTrace();
        }


    }
}
