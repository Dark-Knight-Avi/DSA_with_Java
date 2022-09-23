package dsa.linkedList;

import java.util.Scanner;

public class MergeTwoSortedList {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void pushElem(MergeTwoSortedList list, int data) {
        Node newNode = new Node(data);
        if (data < list.head.data){
            newNode.next = list.head;
            list.head = newNode;
            return;
        }
        Node cur = list.head;
        Node prev = null;
        do{
            prev = cur;
            cur = cur.next;
            if (cur == null){
                break;
            }
        } while (data >= cur.data);
        prev.next = newNode;
        newNode.next = cur;
    }
    public static void reverse(MergeTwoSortedList list){
        Node cur = list.head;
        Node prev = null;
        Node next;
        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        list.head = prev;
    }
    public static void printList(MergeTwoSortedList list) {
        Node cur = list.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            MergeTwoSortedList list = new MergeTwoSortedList();
            int n1 = sc.nextInt();
            for (int idx = 0; idx < n1; idx++) {
                list.push(sc.nextInt());
            }
            reverse(list);
            int n2 = sc.nextInt();
            for (int idx = 0; idx < n2; idx++) {
                data = sc.nextInt();
                pushElem(list, data);
            }
            printList(list);
        }
    }
}
