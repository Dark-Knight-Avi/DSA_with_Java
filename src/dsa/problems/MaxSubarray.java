package dsa.problems;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < n; i++){
            cur_sum = Math.max((max_sum + arr[i]), arr[i]);
            max_sum = Math.max(cur_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
