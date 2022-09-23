package dsa.recursion;

public class TowerOfHanoi {
    public static void TOH(int discNum, String source, String helper, String destination){
        if (discNum == 1){
            System.out.println("Transfer Disk-" + discNum + " from " + source + " to " + destination);
            return;
        }
        TOH(discNum-1, source, destination, helper);
        System.out.println("Transfer Disk-" + discNum + " from " + source + " to " + destination);
        TOH(discNum-1, helper, source, destination);
    }
    public static void main(String[] args) {
        TOH(3, "S", "H", "D");
    }
}
