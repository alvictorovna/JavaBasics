package org.example;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbArray = {{2,3,4,5}, {3,4,5,6}, {3,5,6,7}, {5,6,7,8}};
        int oddSum = 0;
        int evenSum = 0;
        for (int[] row: numbArray) {
            for (int elem: row) {
                if(elem %2 == 0){
                    evenSum += elem;
                }else oddSum += elem;
            }

        }

        System.out.println("Odd sum: " + oddSum + "\n" + "Even sum: " + evenSum);
    }
}
