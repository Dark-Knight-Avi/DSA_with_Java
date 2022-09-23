package dsa.recursion;

public class Occurrence {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char character){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == character){
            if (first == -1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOccurence(str, idx+1, character);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}
