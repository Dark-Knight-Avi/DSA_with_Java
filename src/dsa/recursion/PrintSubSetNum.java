package dsa.recursion;

import java.util.ArrayList;

public class PrintSubSetNum {
    public static void printSubsets(ArrayList<Integer> arr){
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void findSubset(int n, ArrayList<Integer> arr, int cur){
        if (cur > n){
            printSubsets(arr);
            return;
        }
//        Will add in the list ->
        arr.add(cur);
        findSubset(n, arr, cur + 1);
//        Will not add in the list ->
        arr.remove(arr.size() - 1);
        findSubset(n, arr, cur + 1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        findSubset(3, arr, 1);
    }
}
