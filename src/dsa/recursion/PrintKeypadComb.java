package dsa.recursion;

public class PrintKeypadComb {
    public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadComb(String query, int idx, String combination){
        if (idx == query.length()){
            System.out.println(combination);
            return;
        }
        char currChar = query.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++){
            printKeypadComb(query, idx +1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printKeypadComb("23", 0, "");
    }
}
