package dsa.Sorting;

public class MergeSort {
    public static void divide(int [] arr, int start, int end){
        if(start >= end) {
            return;
        }
        int mid = start + (end - start) / 2; // (start + end) / 2; -> Sometime can cause space complexity
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int [] merged = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int idx = 0;
        while (idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                merged[idx++] = arr[idx1++];
            } else {
                merged[idx++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            merged[idx++] = arr[idx1++];
        }
        while (idx2 <= end){
            merged[idx++] = arr[idx2++];
        }
        for (int i = 0, j = start; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int [] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
