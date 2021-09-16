package com.bootcamp.homework.seventhWeek;

public class SeventhWeek {

  public static void main(String[] args) {

      int [] myArray = {3, 5, 18, 9, 21, 20, 4, 17, 8, 1};
      int i,  max;

      max = myArray[0];
      for (i = 1; i < myArray.length; i++)
          if (myArray[i] > max) {
              max = myArray[i];
          }
      System.out.println("Dizinin en buyuk  elemani = " + max);
  }
}