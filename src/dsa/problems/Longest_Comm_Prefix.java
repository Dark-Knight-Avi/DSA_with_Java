package dsa.problems;

import java.util.Arrays;

public class Longest_Comm_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String st = "";
        String aka = "";
        for (int i = 0; i < strs[0].length(); i++) {
            aka = strs[0].substring(0, i + 1);
            if (strs[strs.length - 1].startsWith(aka)) {
                st = aka;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String[] arr = {"abab", "aba", ""};
        System.out.println(longestCommonPrefix(arr));
    }
}
