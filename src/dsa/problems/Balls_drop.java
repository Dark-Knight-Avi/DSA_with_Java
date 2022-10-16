package dsa.problems;

import java.util.Scanner;

public class Balls_drop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = sc.nextInt();
        System.out.println("Enter the col:");
        int col = sc.nextInt();
        int [] emptySpaces = new int[row];
        String flag = "Y";
        for (int i = 0; i < row; i++){
            emptySpaces[i] = row - 1;
        }
        String [][] result = new String[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = "-";
            }
        }
        while (flag != "N"){
            System.out.println("Enter the position to drop:");
            int pos = sc.nextInt();
            if(emptySpaces[pos] < 0){
                System.out.println("No space in this position!! Try another!!");
                continue;
            }
            System.out.println("Enter the color of the ball:");
            String color = sc.next();
            int temp = emptySpaces[pos]--;
            result[temp][pos] = color;
            System.out.println("The result is:");
            for (String[] str : result){
                for (String s: str){
                    System.out.print(s);
                }
                System.out.println();
            }
            System.out.println("Do you want to continue? (Y/N)");
            flag = sc.next();
        }
        System.out.println("Thank You!!");
    }
}
