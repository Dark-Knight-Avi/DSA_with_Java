package dsa.recursion;

public class Recursion {
//    Stack Height = n ->
//    public static int xPowerN(int x, int n) {
//        if (n == 0)
//            return 1;
//        else if (x == 0)
//            return 0;
//        else
//            return (x * xPowerN(x, n - 1));
//    }
//    Stack Height = log(n) ->
    public static int xPowerN(int x, int n) {
        if (n == 0)
            return 1;
        else if (x == 0)
            return 0;
        else {
            if (n % 2 == 0) {
//              Even ->
                int xPNb2 = xPowerN(x, n/2);
                return (xPNb2 * xPNb2);
            }
            else {
//              Odd ->
                int xPNb2 = xPowerN(x, n/2);
                return (xPNb2 * xPNb2 * x);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2, 4));
    }
}
