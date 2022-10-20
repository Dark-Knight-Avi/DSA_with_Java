package dsa.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static ArrayList<Integer> resArray = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String str = String.valueOf(num);
//        printPermutation(str, "");
//        for (int i: resArray){
//            System.out.print(i + " ");
//        }
//    }

    public static void printPermutation(String str, String res) {
        if (str.length() == 0){
            resArray.add(Integer.parseInt(res));
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1);
            printPermutation(temp, res + ch);
        }
    }
}
