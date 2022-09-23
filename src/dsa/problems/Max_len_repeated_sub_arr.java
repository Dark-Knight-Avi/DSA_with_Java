package dsa.problems;
import java.util.ArrayList;
import java.util.HashSet;

public class Max_len_repeated_sub_arr {
    public static int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        HashSet<ArrayList<Integer>> sub_arr1 = new HashSet<>();
        HashSet<ArrayList<Integer>> sub_arr2 = new HashSet<>();
        for(int i = 0; i < len1; i++){
            for(int j = i; j<len1; j++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    temp.add(nums1[k]);
                }
                sub_arr1.add(temp);
            }
        }
        System.out.println(sub_arr1);
        for(int i = 0; i < len2; i++){
            for(int j = i; j<len2; j++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    temp.add(nums2[k]);
                }
                sub_arr2.add(temp);
            }
        }
        System.out.println(sub_arr2);
        int count = 0;
        for(ArrayList<Integer> arr1: sub_arr1){
            if (sub_arr2.contains(arr1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 2, 1};
        int [] arr2 = {3, 2, 1, 4, 7};
        System.out.println(findLength(arr1, arr2));
    }
}
