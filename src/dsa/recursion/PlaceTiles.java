package dsa.recursion;

public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
//        Vertically Place ->
        int verticalPlace = placeTiles(n - m, m);
//        Horizontally Place ->
        int horizontalPlace = placeTiles(n - 1, m);
        return verticalPlace + horizontalPlace;
    }
    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}
