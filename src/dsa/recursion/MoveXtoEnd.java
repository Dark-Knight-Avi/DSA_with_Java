package dsa.recursion;

public class MoveXtoEnd {
    public static int count = 0;
    public static String newString = "";
    public static void moveXToEnd(String str, int idx){
        if (idx == str.length()){
            for (int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if (curChar == 'x'){
            count++;
            moveXToEnd(str, idx + 1);
        } else {
            newString += curChar;
            moveXToEnd(str, idx + 1);
        }
    }
    public static void main(String[] args) {
        moveXToEnd("axbcxxd", 0);
    }
}
