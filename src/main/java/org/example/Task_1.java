package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task_1 {
    public static void main(String[] args) {
        int[] temperature = {32, 30, 101, 34, 90, 108, 100};

        int max = temperature[0];
        int min = temperature[0];

        for (int temp: temperature) {
            if(temp>max){
                max = temp;
            }

            if (temp<min){
                min = temp;
            }
        }
        System.out.println(max + " " + min);
    }
}