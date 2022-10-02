package dsa.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class concentration {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            arr.add(sc.nextInt());
//        }
//        int conc = sc.nextInt();
//        ArrayList<Arraylist<Integer>> idx = new ArrayList<>();
        int[][] arr = new int[2 * n + 1][n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] temp = new int[n];
                int id = 0;
                for (int k = i; k <= j; k++) {
                    temp[id++] = k;
                }
                arr[idx++] = temp;
            }
        }
        for (int[] arrr : arr) {
            for (int x : arrr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
