package dsa.recursion;

public class FindSubArray {
    public static int[][] findSubArray(int[] arr, int start, int end, int[][] res, int idx){
        if(end == arr.length){
            return res;
        } else if(start > end){
            return findSubArray(arr, 0, end + 1, res, idx);
        } else {
            int id = 0;
            for(int i = start; i < end; i++){
                res[idx][id] = arr[i];
                id++;
            }
            return findSubArray(arr, start + 1, end, res, idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int[][] res = new int[7][3];
        findSubArray(arr, 0, 0, res, 0);
        for (int[] x: res){
            for(int i: x){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
