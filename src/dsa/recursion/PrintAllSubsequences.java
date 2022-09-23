package dsa.recursion;

public class PrintAllSubsequences {
    public static void subSeqStr(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
//        currChar choose to come ->
        subSeqStr(str, idx + 1, newString + currChar);
//        currChar choose not to come ->
        subSeqStr(str, idx + 1, newString);
    }
    public static void main(String[] args) {
        subSeqStr("abc", 0, "");
    }
}
