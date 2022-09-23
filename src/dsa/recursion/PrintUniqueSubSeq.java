package dsa.recursion;

import java.util.HashSet;
import java.util.SortedMap;

public class PrintUniqueSubSeq {
    public static void uniqueSubSeqStr(String str, int idx, String newStr, HashSet<String> set){
        if (idx == str.length()){
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqueSubSeqStr(str, idx + 1, newStr + currChar, set);
        uniqueSubSeqStr(str, idx + 1, newStr, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubSeqStr("abc", 0, "", set);
    }
}
