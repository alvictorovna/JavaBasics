package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {20,1,45,78,32,45,8,90,45,90};

        int max = numbers[0];
        int secondMax = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if(secondMax < number && number != max){
                secondMax = number;
            }

        }

        System.out.println(secondMax);
        System.out.println(max);
    }
}
