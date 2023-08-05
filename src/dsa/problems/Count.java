package dsa.problems;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 5, 1, 7, 2, 5, 7, 4, 3};
        int n = arr.length;
        int[] count = new int[n];
        System.out.print("arr Array: [");
        for (int item: arr){
            System.out.print(item + " ");
        }
        System.out.println("]");
        System.out.print("Initial Count Array: [");
        for (int item: count){
            System.out.print(item + " ");
        }
        System.out.println("]");
        for (int i = 0; i < n; i++) {
            count[arr[i] - 1]++;
            System.out.print("Step-" + i + ": [");
            for (int item: count){
                System.out.print(item + " ");
            }
            System.out.println("]");
        }
        for (int i = 0; i < n; i++) {
            if (count[i] > 1) {
                System.out.println((i + 1) + " is repeated.");
            }
        }
    }
}
