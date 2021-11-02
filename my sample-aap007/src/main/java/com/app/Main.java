package com.app;

public class Main {
    public static void main(String[] args) {
        try {
            String s = "sdfsvxvfv";
            System.out.println(s.length());
            System.out.println("Динамо");
            int[] igra = new int[1];

            ///igra [5] = 17;
            int resultat = Integer.parseInt("123");
            makeexeption(23);
        } catch (NullPointerException e) {
            System.out.println("Ошибка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка 2");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка 3");

        }finally {
            System.out.println("в гараже");

        }
    }
    private static void makeexeption (int win){
        if (win<100){
            throw new IllegalArgumentException();
        }
    }

}
