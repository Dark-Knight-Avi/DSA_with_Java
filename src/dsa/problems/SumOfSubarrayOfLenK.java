package dsa.problems;

import java.util.Scanner;

public class SumOfSubarrayOfLenK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int [] sum = new int[n - k + 1];
        int cur_sum = 0;
        for (int i = 0; i < k; i++){
            cur_sum += arr[i];
        }
        sum[0] = cur_sum;
        for (int i = 1; i < n - k + 1; i++){
            cur_sum = cur_sum - arr[i - 1] + arr[i + k - 1];
            sum[i] = cur_sum;
        }
        for (int i: sum){
            System.out.println(i);
        }
    }
}
