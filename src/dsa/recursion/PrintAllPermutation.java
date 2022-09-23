 package dsa.recursion;

public class PrintAllPermutation {
    public static void printPermutation(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            printPermutation(str.substring(0, i) + str.substring(i + 1), permutation + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        printPermutation("abc", "");
    }
}
