package dsa.linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareList {
        Node head;
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        public int isIdentical(CompareList list){
            Node temp1 = this.head;
            Node temp2 = list.head;
            while (temp1 != null && temp2 != null){
                if (temp1.data != temp2.data){
                    return 0;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return (temp1 != null && temp2 != null ? 0 : 1);
        }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> sol = new ArrayList<>();
            int t = sc.nextInt();
            for (int i = 0; i < t; i++){
                CompareList list1 = new CompareList();
                CompareList list2 = new CompareList();
                int n1 = sc.nextInt();
                for (int idx = 0; idx < n1; idx++) {
                    list1.push(sc.nextInt());
                }
                int n2 = sc.nextInt();
                for (int idx = 0; idx < n2; idx++){
                    list2.push(sc.nextInt());
                }
                sol.add(list1.isIdentical(list2));
            }
            for (int i : sol){
                System.out.println(i);
            }
        }

}
