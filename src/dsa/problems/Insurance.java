package dsa.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [][] num = new int[t][2];
        for (int i = 0; i < t; i++){
            String [] str_nums = bi.readLine().split(" ");
            for (int j = 0; j < str_nums.length; j++){
                num[i][j] = Integer.parseInt(str_nums[j]);
            }
        }
        for (int [] n : num){
            System.out.println(Math.min(n[0], n[1]));
        }
    }
}
