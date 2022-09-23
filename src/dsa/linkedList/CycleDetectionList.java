package dsa.linkedList;

import java.util.Scanner;

public class CycleDetectionList {
    public static int flag = 0;
    Node head;
    public static void push(CycleDetectionList list, int data){
        Node cur = list.head;
        Node newNode = new Node(data);
        if (cur == null){
            newNode.next = null;
            list.head = newNode;
            return;
        }
        while (cur != null){
            if (cur.data == data){
                flag = 1;
            }
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            CycleDetectionList list = new CycleDetectionList();
            for (int j = 0; j < n; j++){
                push(list, sc.nextInt());
            }
            System.out.println(flag);
        }
    }
}
