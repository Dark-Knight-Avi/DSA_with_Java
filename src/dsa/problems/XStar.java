package dsa.problems;

import java.util.Scanner;

public class XStar {
    static void pattern(String str, int len)
    {
        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            for (int k = 0; k < len; k++) {
                if (k == i || k == j)
                    System.out.print(str.charAt(k));
                else
                    System.out.print("  ");
            }

            System.out.println("");
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
