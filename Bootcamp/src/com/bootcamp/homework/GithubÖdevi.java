package com.bootcamp.homework;

public class GithubÖdevi {
    public static void main (String [] args){
        int [] myArray = {1,2,3,4,5,7,10};
        int i;
        int enbuyuksayi= myArray [0];
        for(i=1;i<10;i++) {
            if (myArray[i] > enbuyuksayi) {
                enbuyuksayi = myArray[i];
            }
        }
        System.out.println("En büyük sayı : " +enbuyuksayi);
    }
}
