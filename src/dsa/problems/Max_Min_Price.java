package dsa.problems;
import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            int max = 0;
            int idx = 0;
            while (idx != m){
                max += arr[idx++];
            }
            int min = 0;
            while (idx != n){
                min += arr[idx++];
            }
            System.out.println(min - max);
        }
    }
}
