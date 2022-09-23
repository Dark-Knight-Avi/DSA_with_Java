package dsa.recursion;

public class RemoveDupStr {
    public static boolean [] map = new boolean[26];
    public static String newString = "";
    public static void removeDuplicate(String str, int idx){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if (!map[curChar - 'a']) {
            newString += curChar;
            map[curChar - 'a'] = true;
        }
        removeDuplicate(str, idx + 1);
    }
    public static void main(String[] args) {
        removeDuplicate("adsadaadffgaaarsfdgddssfgfggfsfgvbcvbvytsghhfhfghfh", 0);
    }
}
