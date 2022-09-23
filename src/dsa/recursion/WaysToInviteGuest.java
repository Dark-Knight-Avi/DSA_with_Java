package dsa.recursion;

public class WaysToInviteGuest {
    public static int findWays(int n){
        if (n <= 1){
            return 1;
        }
//        single call ->
        int singleCall = findWays(n - 1);
//        pair call ->
        int pairCall = (n - 1) * findWays(n - 2);
        return singleCall + pairCall;
    }
    public static void main(String[] args) {
        System.out.println(findWays(4));
    }
}
