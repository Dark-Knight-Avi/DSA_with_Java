package dsa.recursion;

public class CountPathMatrix {
    public static int countPath(int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        if (i == n - 1 && j == m -1){
            return 1;
        }
//        Move downwards ->
        int downPaths = countPath(i+1, j, n, m);
//        Move right ->
        int rightPaths = countPath(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        System.out.println(countPath(0, 0, 3, 3));
    }
}
