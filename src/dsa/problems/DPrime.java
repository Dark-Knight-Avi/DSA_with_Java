package dsa.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class DPrime {
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isContainsMoreD(int num, int d, int N){
        int min = N % 2 == 0 ? N/2 : N/2 + 1;
        int count = 0;
        while (num > 0){
            int digit = num % 10;
            if(digit == d){
                count++;
            }
            num = num / 10;
        }
        return count == min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int start = (int) Math.pow(10, N - 1);
        int end = (int) Math.pow(10, N) - 1;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start + 1; i < end; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        for (int i: primes){
            if (isContainsMoreD(i, d, N)){
                result.add(i);
            }
        }
        int sum = 0;
        for(int i: result){
            sum += i;
        }
        System.out.println(sum);
    }
}
