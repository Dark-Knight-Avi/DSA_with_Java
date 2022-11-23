package dsa.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        ArrayList<Character> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            nums.add((char) i);
        }
        if(nums.contains(str.charAt(str.length() - 1))){
            if (len >= 100){
                System.out.println(-1);
            } else {
                System.out.println((str.charAt(len - 1) - '0') * 10);
            }
        } else {
            if(len >= 10){
                System.out.println(-1);
            } else {
                System.out.println(len);
            }
        }
    }
}
