package dsa.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        char [] symbol = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        ArrayList<Character> arrlist = new ArrayList<>();
        for (char ch: symbol){
            arrlist.add(ch);
        }

        String org = "";
        for(int i = 0; i < str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)) || arrlist.contains(str.charAt(i))){
                org += String.valueOf(str.charAt(i));
            }
        }
        System.out.println(org);
        String rev = "";
        for(int i = org.length() - 1; i >= 0; i--){
            rev += String.valueOf(org.charAt(i));
        }
        System.out.println(rev);
        if(Objects.equals(org, rev)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
