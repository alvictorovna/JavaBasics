package org.example;

public class Task6 {
    public static void main(String[] args) {
        int num = 5;
        boolean check = true;
        int numSqrt = (int)Math.sqrt(num);
        String result = "";

        for (int i = 2; i<=numSqrt; i++){
            if(num%i == 0) {
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("Number is prime");
        }else System.out.println("Number is not prime");


    }
}

