package dsa.problems;

import java.util.Scanner;

public class XStar {
    static void pattern(String str, int len)
    {
        int left = 0;
        int mid = 2 * len - 3;
        for (int i = 0; i < len/2; i++) {
            for (int j = 0; j < left; j++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            for (int k = 0; k < mid; k++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            System.out.println();
            left += 2;
            mid -= 4;
        }
        for(int k = 0; k < left; k++){
            System.out.print(" ");
        }
        System.out.print(str.charAt(len/2));
        System.out.println();
        left -= 2;
        mid += 4;
        for (int i = len/2 + 1; i < len; i++) {
            for (int j = 0; j < left; j++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            for (int k = 0; k < mid; k++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            System.out.println();
            left -= 2;
            mid += 4;
        }
    }
    public static void main(String[] args)
    {
        String str = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            str += String.valueOf(i);
        }
        String rev = "";
        for (int i = str.length() - 2; i >= 0; i--){
            rev += String.valueOf(str.charAt(i));
        }
        String res = str + rev;
        pattern(res, res.length());
    }
}
