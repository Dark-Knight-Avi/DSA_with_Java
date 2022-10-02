package dsa.problems;

import java.util.*;

public class String_Repeat {
    public static ArrayList<String> printRepeat(String str){
        String [] arr = str.split(" ");
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        ArrayList<String> result = new ArrayList<>();
        for (String s1: set){
            int count = 0;
            for (String s2: arr){
                if (Objects.equals(s1, s2)){
                    count++;
                }
            }
            if (count > 1){
                result.add(s1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        ArrayList<String> arr = printRepeat(str);
        for (String s: arr){
            if (Objects.equals(s, arr.get(arr.size() - 1))){
                break;
            }
            System.out.print(s + " ");
        }
        System.out.print(arr.get(arr.size() - 1));
    }
}
