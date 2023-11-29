package org.example;

public class Task2 {

    public static void main(String[] args) {
        int[] numArray = new int[10];
        int sum = 0;
        String result = "";

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = (int)(Math.random() * 10);
            sum+=numArray[i];
            result += String.format("%d ", numArray[i]);
        }


        System.out.println("Sum of numbers: " + result + " = " + sum);
    }

}
