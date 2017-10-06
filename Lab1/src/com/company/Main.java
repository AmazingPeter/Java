package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10],
            myArrayTmp;

        System.out.println("---------------------------");
        System.out.println("Generated array:");
        Random r = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = r.nextInt(500) + r.nextInt(500) + Integer.parseInt(String.format("%tS", new Date()));
            System.out.println(myArray[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Arrays.sort():");
        myArrayTmp = myArray;
        Arrays.sort(myArrayTmp);
        for(int val: myArrayTmp) {
            System.out.println(val);
        }

        System.out.println("---------------------------");
        System.out.println("bubbleSort():");
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int t = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = t;
                }
            }
        }
        for(int val: myArray) {
            System.out.println(val);
        }

    }
}
