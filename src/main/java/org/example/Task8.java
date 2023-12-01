package org.example;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {10,14,56,78,43,45};

        int max = numbers[0];
        int min = numbers[0];

        for (int n: numbers) {
            if(n > max){
                max = n;
            }

            if(n < min){
                min = n;
            }

        }

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
