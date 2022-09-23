package dsa.problems;

import java.util.*;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
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
    }
}
