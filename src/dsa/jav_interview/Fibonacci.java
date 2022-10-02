package dsa.jav_interview;

import java.util.Scanner;

public class Fibonacci {
    public static int printFib(int n){
        if (n == 0){
           return 0;
        }
        if (n == 1){
            return 1;
        }
        return printFib(n - 1) + printFib(n - 2);
    }
    public static void main(String[] args) {
//        0, 1, 1, 2, 3, 5, 8 -> n = 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Fib(" + n + "):");
        System.out.println(printFib(n));
    }
}
