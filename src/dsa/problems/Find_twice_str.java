package dsa.problems;

import java.util.HashSet;
import java.util.Scanner;

public class Find_twice_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "statesmans";
        HashSet <Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        int [] arr = new int[set.size()];
        int j = 0;
        for (Character c : set){
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == c){
                    count++;
                }
            }
            arr[j++] = count;
        }
        int res = 0;
        for (int i: arr){
            if (i == 2){
                res++;
            }
        }
        System.out.println(res);
    }
}
