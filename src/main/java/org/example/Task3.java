package org.example;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbArray = {{2,3,4,5}, {3,4,5,6}, {3,5,6,7}, {5,6,7,8}};
        String result = "";
        for(int i = 0; i<numbArray.length; i++){
            for(int j = 0; j<numbArray[i].length; j++){
                if(numbArray[i][j]%2 == 0){
                    result+=numbArray[i][j] + " ";
                }
            }
        }

        System.out.println("Even numbers: " + result);
    }
}
