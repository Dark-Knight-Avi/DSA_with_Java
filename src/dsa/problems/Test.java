package dsa.problems;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            int skip = 1;
            for(int j = 1; j >= i; j--) {
                System.out.print("_");
            }
            for (int j = 0; j < 2*i + skip; j++){
                System.out.print("*");
            }
            for(int j = 2; j > i; j--){
                System.out.print("_");
            }
            System.out.println();
        }
        int skip = 3;
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("_");
            }
            int j = 0;
            while(j != skip){
                System.out.print("*");
                j++;
            }
            skip -= 2;
            for (int k = 1; k <= i; k++){
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
