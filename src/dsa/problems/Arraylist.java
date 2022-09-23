package dsa.problems;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(5);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(9);
//        for (int i: l1){
//            System.out.println(i);
//        }
        for (int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
//        ArrayList<String> l2 = new ArrayList<>();
//        l2.add("Hi");
//        l2.add("my");
//        l2.add("name");
//        l2.add("is");
//        l2.add("Aritra");
    }
}
