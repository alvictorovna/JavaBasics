package org.example;

public class Task10 {
    public static void main(String[] args) {
        String[] arrayStr = {"Hello", "World", "How", "World", "How are You?", "Day", "Day", "Hello"};

        for (int i = 0; i<arrayStr.length; i++){
            for(int j = i+1; j<arrayStr.length; j++){
                if(arrayStr[i].equals(arrayStr[j])){
                    System.out.println(arrayStr[i]);
                }
            }
        }


    }
}
