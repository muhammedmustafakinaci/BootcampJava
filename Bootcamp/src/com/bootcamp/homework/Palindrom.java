package com.bootcamp.homework;
import java.util.Scanner ;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        String yenikelime = "";

        for (int i = (kelime.length() - 1); i >= 0; i--) {
            yenikelime += kelime.charAt(i);
        }
        if (yenikelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrom bir kelimedir");
        } else {
            System.out.println("Girilen kelime Palindrom bir kelime degildir");

        }
    }
}