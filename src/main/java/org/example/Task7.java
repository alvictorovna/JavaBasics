package org.example;

public class Task7 {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println(fibonacchi(i));
        }
    }

    public static int fibonacchi(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacchi(n-2) + fibonacchi(n-1);
    }
}
