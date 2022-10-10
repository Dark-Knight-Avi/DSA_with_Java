package dsa.matrix;

import java.util.Objects;

public class Word_search {
    public static boolean wordSearch(String[][] matrix, String word) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        for (int i = top; i <= bottom; i++){
            for (int j = left; j <= right; j++){
                if (Objects.equals(matrix[i][j], String.valueOf(word.charAt(0)))){
                    boolean exists = dfs(matrix, word, 0, i, j, m, n, new boolean[m][n]);
                    if (exists){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(String[][] matrix, String word, int index, int i, int j, int m, int n, boolean[][] visited) {
        if(index == word.length()){
            return true;
        }
        if (i >= m || j >= n || i < 0 || j < 0 ||visited[i][j] || String.valueOf(word.charAt(index)) != matrix[i][j]){
            return false;
        }
        visited[i][j] = true;
        boolean exists = dfs(matrix, word, index + 1, i + 1, j, m, n, visited);
        if (!exists){
            exists = exists || dfs(matrix, word, index + 1, i - 1, j, m, n, visited);
        }
        if (!exists){
            exists = exists || dfs(matrix, word, index + 1, i , j + 1, m, n, visited);
        }
        if (!exists){
            exists = exists || dfs(matrix, word, index + 1, i, j - 1, m, n, visited);
        }
        visited[i][j] = false;
        return exists;
    }

    public static void main(String[] args) {
        String [][] matrix = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String word = "ABCCED";
        System.out.println(wordSearch(matrix, word));
    }
}
