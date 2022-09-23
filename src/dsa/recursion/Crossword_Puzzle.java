package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Crossword_Puzzle {
    public static boolean canPlaceWordHorizontally(List<String> arr, String word, int i, int j){
        if (j - 1 >= 0 && arr.get(i).charAt(j - 1) !='+'){
            return false;
        } else if (j + word.length() < arr.get(0).length() && arr.get(i).charAt(j + word.length()) != '+'){
            return false;
        }
        for (int jj = 0; jj < word.length(); jj++){
            if ((j + jj) >= arr.get(0).length()){
                return false;
            }
            if (arr.get(i).charAt(j + jj) == '-' || arr.get(i).charAt(j + jj) == word.charAt(jj)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean canPlaceWordVertically(List<String> arr, String word, int i, int j){
        if (i - 1 >= 0 && arr.get(i - 1).charAt(j) !='+'){
            return false;
        } else if (i + word.length() < arr.size() && arr.get(i + word.length()).charAt(j) != '+'){
            return false;
        }
        for (int ii = 0; ii < word.length(); ii++){
            if ((i + ii) >= arr.size()){
                return false;
            }
            if (arr.get(i + ii).charAt(j) == '-' || arr.get(i + ii).charAt(j) == word.charAt(ii)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean[] placeWordHorizontally(List<String> arr, String word, int i, int j){
        boolean[] wePlacedHor = new boolean[word.length()];
        for (int jj = 0; jj < word.length(); jj++){
            if (arr.get(i).charAt(j + jj) == '-') {
                arr.set(i, (arr.get(i).substring(0, (j + jj) - 1) + word.charAt(jj) + arr.get(i).substring((j + jj) + 1)));
                wePlacedHor[jj] = true;
            }
        }
        return wePlacedHor;
    }
    public static void unPlaceWordHorizontally(List<String> arr, boolean[] wePlaced, int i, int j) {
        for (int jj = 0; jj < wePlaced.length; jj++) {
            if (wePlaced[jj]){
                arr.set(i, (arr.get(i).substring(0, (j + jj) - 1) + "-" + arr.get(i).substring((j + jj) + 1)));
            }
        }
    }
    public static boolean[] placeWordVertically(List<String> arr, String word, int i, int j){
        boolean[] wePlacedVer = new boolean[word.length()];
        for (int ii = 0; ii < word.length(); ii++){
            if (arr.get(i + ii).charAt(j) == '-') {
                arr.set((i + ii), (arr.get(i + ii).substring(0, j - 1) + word.charAt(ii) + arr.get(i + ii).substring(j + 1)));
                wePlacedVer[ii] = true;
            }
        }
        return wePlacedVer;
    }
    public static void unPlaceWordVertically(List<String> arr, boolean[] wePlaced, int i, int j){
        for (int ii = 0; ii < wePlaced.length; ii++) {
            if (wePlaced[ii]){
                arr.set((i + ii), (arr.get(i + ii).substring(0, j - 1) + "-" + arr.get(i + ii).substring(j + 1)));
            }
        }
    }
    public static List<String> crosswordPuzzle(List<String> arr, String [] words, int vidx) {
        if (vidx == arr.size()){
            return arr;
        }
        String word = words[vidx];
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).length(); j++) {
                if (arr.get(i).charAt(j) == '-' || arr.get(i).charAt(j) == word.charAt(0)){
                    if (canPlaceWordHorizontally(arr, word, i, j)) {
                        boolean[] wePlaced = placeWordHorizontally(arr, word, i, j);
                        crosswordPuzzle(arr, words, vidx + 1);
                        unPlaceWordHorizontally(arr, wePlaced, i, j);
                    }
                    if (canPlaceWordVertically(arr, word, i, j)) {
                        boolean[] wePlaced = placeWordVertically(arr, word, i, j);
                        crosswordPuzzle(arr, words, vidx + 1);
                        unPlaceWordVertically(arr, wePlaced, i, j);
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("+-++++++++");
        arr.add("+-++++++++");
        arr.add("+-++++++++");
        arr.add("+-----++++");
        arr.add("+-+++-++++");
        arr.add("+-+++-++++");
        arr.add("+++++-++++");
        arr.add("++------++");
        arr.add("+++++-++++");
        arr.add("+++++-++++");
        String wordList = "LONDON;DELHI;ICELAND;ANKARA";
        String[] words = wordList.split(";");
        List<String> result = crosswordPuzzle(arr, words, 0);
        for (String str: result){
            System.out.println(str);
        }
    }
}
