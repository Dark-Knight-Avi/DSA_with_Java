package dsa.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largest_Prime_Number {
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        Permutation.printPermutation(str, "");
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i: Permutation.resArray){
            if (isPrime(i)){
                prime.add(i);
            }
        }
        Collections.sort(prime);
        System.out.println(prime.get(0));
    }
}
