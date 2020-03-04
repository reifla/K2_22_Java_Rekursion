package com.company;
/*
creating a permutation of a sorted ArrayList "data_2" in a Array "data_1"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int lenOfArray = 10;

    public static void main(String[] args) {
        Random r = new Random();
        int[] data_1 = new int[lenOfArray];             //contains random permutation afterwards
        ArrayList<Integer> data_2 = new ArrayList<>();  //contains sorted data

        for (int i = 0; i < lenOfArray; i++) {          //filling up the ArrayList with data
            data_2.add(i);
        }
        System.out.println(Arrays.toString(data_2.toArray()));  //checking data in ArrayList

        for (int i = 0; i < lenOfArray; i++) {
            int y = r.nextInt(data_2.size());           //generating rand number 0..size of ArrayList
            data_1[i] = data_2.get(y);                  //fetching random element of ArrayList and putting it in array
            System.out.println(i + ". -> Random: " + y+" -- Number = " + data_1[i]);
            data_2.remove(y);                           //removing element i from sorted ArrayList --> shrinks ArrayL
            //so one after another element from sorted ArrayList (data_2) is moved to the unsorted Array (data_1)
            System.out.println(Arrays.toString(data_2.toArray()));
        }
        System.out.println(Arrays.toString(data_1));
    }
}

