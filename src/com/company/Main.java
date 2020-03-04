package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static final int lenOfArray = 10;

    public static void main(String[] args) {
        Random r = new Random();
        int[] data_1 = new int[lenOfArray];
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < lenOfArray; i++) {
            data.add(i);
        }
        System.out.println(Arrays.toString(data.toArray()));

        for (int i = 0; i < lenOfArray; i++) {
            int y = r.nextInt(data.size());
            data_1[i] = data.get(y);
            System.out.println(i + ". -> Random: " + y+" -- Number = " + data_1[i]);
            data.remove(y);
            System.out.println(Arrays.toString(data.toArray()));
        }


        System.out.println(Arrays.toString(data_1));
    }

}

