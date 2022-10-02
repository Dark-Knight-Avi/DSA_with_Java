package dsa.problems;
import java.util.Scanner;

public class ArrayReverse {
    public static void ReverseArray(int [] arr){
        int len = arr.length;
        for (int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ReverseArray(arr);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}
