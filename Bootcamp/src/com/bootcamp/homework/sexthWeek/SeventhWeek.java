package com.bootcamp.homework.sexthWeek;
import java.util.ArrayList;
import java.util.Arrays;

public class SeventhWeek {

    public static void main(String[] args) {

        int[] myArray = {3, 5, 18, 9, 21, 20, 4, 17, 8, 1};
        int i, enbuyuksayi1, enbuyuksayi2;

        enbuyuksayi1 = myArray[0];
        enbuyuksayi2 = myArray[1];
        for (i = 1; i < myArray.length; i++)
            if (myArray[i] > enbuyuksayi1) {
                enbuyuksayi1 = myArray[i];
            }
        System.out.println("Dizinin en buyuk  elemani = " + enbuyuksayi1);
        for (i = 1; i < myArray.length; i++)
            if (myArray[i] > enbuyuksayi1) {
                enbuyuksayi2 = enbuyuksayi1;
                enbuyuksayi1 = myArray[i];
            }
        System.out.println("Dizinin en buyuk ikinci elemani = " + enbuyuksayi2);
    }

}


